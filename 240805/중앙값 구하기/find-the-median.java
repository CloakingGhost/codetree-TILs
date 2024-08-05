import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        java.util.Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}