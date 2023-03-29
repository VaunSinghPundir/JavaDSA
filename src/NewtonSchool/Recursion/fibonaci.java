package NewtonSchool.Recursion;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        System.out.println(fibo(n));

    }

    private static int fibo (int n){
        if (n < 2){
            return n;
        }

        int fibo = fibo(n - 1) + fibo(n - 2);

        return fibo;
    }
}
