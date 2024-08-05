public class Main {
    public static void main(String[] args) {
        int a = new java.util.Scanner(System.in).nextInt();
        if(a % 2 == 1){
            a += 3;
        }
            if(a % 3 == 0){
                a /= 3;
            }
        System.out.println(a);
    }
}