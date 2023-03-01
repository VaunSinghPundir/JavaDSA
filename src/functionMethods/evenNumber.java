package functionMethods;

import java.util.Scanner;

public class evenNumber {

    //               question :  find even number

    public static void evennumber (int n){
        if(n%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evennumber(n);

    }
}
