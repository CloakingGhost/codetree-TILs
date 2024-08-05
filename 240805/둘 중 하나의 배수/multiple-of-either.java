public class Main {
    public static void main(String[] args) {
        int a = new java.util.Scanner(System.in).nextInt();
        if(a % 3 == 0 || a % 5 == 0) System.out.println(1);
        else System.out.println(0);
    }
}