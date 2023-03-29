package NewtonSchool.Recursion;

import java.util.Scanner;

public class Tribonacci_series {

    static int tribo(int n){
        if (n == 1){
            return 0;
        }
        if(n==2){
            return 0;
        }
        if(n==3){
            return 1;
        }

        return tribo(n-1) + tribo(n-2) + tribo(n-3);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        int a = 0;
//        int b = 1;
//
//        int sum = a + b;
//
//
//        for (int i=0;i<n;i++){
//            sum += n-1;
//
//        }
//        System.out.println(sum);

        System.out.println(tribo(n));

    }
}
