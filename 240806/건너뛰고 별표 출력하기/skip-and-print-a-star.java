public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i - 1; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }        
    }
}