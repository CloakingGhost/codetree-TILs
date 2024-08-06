public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int cnt = 0;
        while(cnt < 2){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }   
                System.out.println();
            }
            System.out.printf("\n");
            cnt++;
        }
    }
}