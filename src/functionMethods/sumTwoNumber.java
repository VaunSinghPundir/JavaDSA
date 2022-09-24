package functionMethods;
import java.util.Scanner;
public class sumTwoNumber {

    static int sum (int a , int b){

        return a + b;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("sum of two number : " + sum(a,b));
    }

}
