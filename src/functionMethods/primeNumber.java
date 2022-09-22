package functionMethods;

import java.util.Scanner;

public class primeNumber {


    //                   Question :  prime number

    public static void primenumber(int n){
        int count = 0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("number is prime");
        }else {
            System.out.println("number is not prime");

        }
    }
    public static void main (String[] args){
        System.out.println("Enter number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primenumber(n);
    }
}
