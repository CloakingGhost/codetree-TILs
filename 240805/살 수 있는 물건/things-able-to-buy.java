public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.printf("%s", n < 1000 ? "no" : n < 3000 ? "mask" : "book");
    }
}