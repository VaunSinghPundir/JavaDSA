package functionMethods;

import java.util.Scanner;

public class primeNumbersBTWTwoNum {
    static void primeNum(int a, int b) {

        int count =0;
        for (int i = a; i <= b; i++) {
           for (int j=2;j<=i-1;j++) {
               if (i % j == 0) {
                   count = count + 1;
               }
           }
               if (count==0){
                   System.out.println(i);
               }else {
                   count=0;
               }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        primeNum(a,b);
    }
}
