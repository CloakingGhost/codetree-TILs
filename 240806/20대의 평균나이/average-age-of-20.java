import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sumAge = 0;
        int inputCount = 0;
        while(sc.hasNextInt()){
            int num = sc.nextInt();

            if(num >= 20 && num < 30) break;
            sumAge += num;
            inputCount++;
        }        
        System.out.printf("%.2f", sumAge / inputCount);
    }
}