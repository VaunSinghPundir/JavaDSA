package Basic;

import java.util.Scanner;

public class gretestDivisionNumber {

    //               question : greatest division number


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        int rem;
        while (a % b != 0) {              //a = 54 , b = 24 ,   rem = 12,  a = b = 24 , b = rem ;
            rem = a % b;

            a = b;
            b = rem;
        }
        System.out.println("gretest division number is : " + b);
    }
}