import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] arr = {null, null};
        arr[0] = new Person(sc.nextInt(), sc.next().equals("M") ? true : false);
        arr[1] = new Person(sc.nextInt(), sc.next().equals("M") ? true : false);
        byte result = 0;
        for(Person p : arr){

            if(p.age >= 19 && p.isMan)
                result = 1;
        }
        System.out.println(result);
        
    }
    static class Person{
        int age;
        boolean isMan;
        Person(int age, boolean isMan){
            this.age = age;
            this.isMan = isMan;
        }
    }
}