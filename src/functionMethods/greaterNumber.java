package functionMethods;
import java.util.Scanner;
public class greaterNumber {

    //                 question : print greater number of two input

    public static int greaternumber (int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public static void main ( String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greaternumber(a,b));
    }
}
