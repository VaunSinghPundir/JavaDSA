package functionMethods;

import java.util.Scanner;

public class tableNumber {

    //                 question :  print table

    public static void table (int n){
        for (int i = 1;i<=10; i++){
            System.out.printf("%d * %d = %d\n",n,i,(n*i));

        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
}
