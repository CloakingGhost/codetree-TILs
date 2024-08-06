import java.util.*;
public class Main {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int isIncluded = 0;
        for(int i = a; i <= b; i++){
            if(1_920 % i == 0 && 2_880 % i == 0){
                isIncluded = 1;
                break;
            }
        }
        System.out.println(isIncluded);
    }

}