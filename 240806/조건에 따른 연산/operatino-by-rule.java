public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int cnt = 0;
        while(n < 1000){
            if(n % 2 == 0){
                n = n * 3 + 1;
            } else {
                // n <<= 1;
                // n += 2;
                n = ++n * 2;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}