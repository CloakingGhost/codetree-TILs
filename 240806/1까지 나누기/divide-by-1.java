public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        int divider = 1;
        int cnt = 0;
        while(n > 1){
            n /= divider++;
            cnt++;
        }
        System.out.println(cnt);
    }
}