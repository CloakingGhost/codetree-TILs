import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.printf("%c\n%.2f\n%.2f",c,a,b);
        sc.close();
    }
}