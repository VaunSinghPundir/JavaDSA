package functionMethods;

import java.util.Scanner;

public class twoNumberMultiplication {

    //                   find multiplication of two number

    public static int multiplication(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = multiplication(a, b);

        System.out.println("multiplication of two number is : " + sum);
    }
}
