import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 첫 번째 부분
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i + 1; j--)
                System.out.print(" ");
            for (int k = 0; k < i + 1; k++)
                System.out.print("* ");
            System.out.println();
        }

        // 두 번째 부분
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = n; k > i; k--)
                System.out.print("* ");
            System.out.println();
        }
    }
}