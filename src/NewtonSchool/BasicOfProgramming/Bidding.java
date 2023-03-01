package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a > b && a > c) {
            System.out.println("alice");
        } else if (b > a && b > c) {
            System.out.println("bob");
        } else {
            System.out.println("charlie");
        }
    }
}
