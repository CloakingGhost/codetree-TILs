import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
    
        System.out.println(a * b / gcd(a, b));

    }

    private static int gcd(int a, int b){
        while(a % b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return b;
    }

}