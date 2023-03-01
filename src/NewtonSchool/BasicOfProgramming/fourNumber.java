package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class fourNumber {
    public static void main(String[] args) {

        /* Problem Statement
        Given four numbers A, B, C, D. Find the maximum number of pairs that can be made.
        (each pair consist of two distinct numbers). Each number can be used only once.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a==b && b==c &&  c==d ){
            System.out.println("0");
        }
        else if (a==b && b==c ){
            System.out.println("1");
        }
        else if (b==c && c==d){
            System.out.println("1");
        }
        else if (c==d && d==a ) {
            System.out.println("1");
        }
        else if(d==a && a==b){
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }
    }
}
