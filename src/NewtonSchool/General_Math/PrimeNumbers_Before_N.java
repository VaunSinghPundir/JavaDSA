package NewtonSchool.General_Math;

import java.util.Scanner;

public class PrimeNumbers_Before_N {

    static boolean isprime(int n){

        n = (int)Math.sqrt(n);

        if(n==1 || n==0) return false;

        for(int i = 2; i <= n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc --> 0){

            int n = sc.nextInt();


            for(int i = 2; i < n; i++){
                if (isprime(i)){
                    System.out.println(i);
                }
            }

        }
    }
}
