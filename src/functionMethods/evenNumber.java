package functionMethods;

import java.util.Scanner;

public class evenNumber {

    //               question :  find even number

    public static void evennumber (int n){
        if(n%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("not even number");
            return;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evennumber(n);

    }
}
