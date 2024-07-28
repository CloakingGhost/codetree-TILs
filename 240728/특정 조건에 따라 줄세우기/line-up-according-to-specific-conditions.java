import java.util.*;
public class Main {
    // 모든 소들의 이름
    private static final String[] COWS = {"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // 조건 저장
        List<String[]> conditions = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            conditions.add(new String[]{parts[0], parts[5]});
        }
        
        // 소들의 순열 생성
        List<String[]> permutations = generatePermutations(COWS);

        // 조건을 만족하는 순열 찾기
        String[] bestPermutation = null;
        for (String[] perm : permutations) {
            if (isValidPermutation(perm, conditions)) {
                if (bestPermutation == null || lexicographicallySmaller(perm, bestPermutation)) {
                    bestPermutation = perm;
                }
            }
        }

        // 결과 출력
        if (bestPermutation != null) {
            for (String cow : bestPermutation) {
                System.out.println(cow);
            }
        }
        
        scanner.close();
    }

    // 소들의 모든 순열을 생성하는 메소드
    private static List<String[]> generatePermutations(String[] array) {
        List<String[]> result = new ArrayList<>();
        permute(array, 0, result);
        return result;
    }

    // 순열 생성 재귀 메소드
    private static void permute(String[] array, int k, List<String[]> result) {
        if (k == array.length) {
            result.add(array.clone());
        } else {
            for (int i = k; i < array.length; i++) {
                swap(array, k, i);
                permute(array, k + 1, result);
                swap(array, k, i);
            }
        }
    }

    // 배열의 두 요소를 교환하는 메소드
    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 조건을 만족하는지 검사하는 메소드
    private static boolean isValidPermutation(String[] permutation, List<String[]> conditions) {
        Map<String, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < permutation.length; i++) {
            positionMap.put(permutation[i], i);
        }
        
        for (String[] condition : conditions) {
            String a = condition[0];
            String b = condition[1];
            int posA = positionMap.get(a);
            int posB = positionMap.get(b);
            if (Math.abs(posA - posB) != 1) {
                return false;
            }
        }
        return true;
    }

    // 두 순열을 비교하여 사전순으로 더 작은지 확인하는 메소드
    private static boolean lexicographicallySmaller(String[] perm1, String[] perm2) {
        for (int i = 0; i < perm1.length; i++) {
            int cmp = perm1[i].compareTo(perm2[i]);
            if (cmp < 0) return true;
            if (cmp > 0) return false;
        }
        return false;
    }
}