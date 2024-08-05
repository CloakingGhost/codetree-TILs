public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        if(n < 500){
            System.out.println("no");
        }else{
            if(n >= 3000){
                System.out.println("book");
            } else if(n >= 1000){
                System.out.println("mask");
                
            }else{
                System.out.println("pen");

            }
        }
    }
}