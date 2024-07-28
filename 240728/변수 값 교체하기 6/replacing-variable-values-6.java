public class Main {
    public static void main(String[] args) {
        swap(2,5);

    }
    private static void swap(int a, int b){
        int tmp = a;
        a= b;
        b= tmp;
        System.out.printf("%d\n%d",a,b);
    }
}