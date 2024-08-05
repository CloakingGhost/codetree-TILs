import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++){
            arr[i] = sc.nextInt();
        } 
        for(int num : arr){
            if(a > num) System.out.println(1);
            else System.out.println(0);
        }
    }
}