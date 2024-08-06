import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isMultiple = 1;
        while(sc.hasNextInt()){
            if(sc.nextInt() % 3 != 0){
                isMultiple = 0;
                break;
            }
        }
        System.out.println(isMultiple);
    }
}