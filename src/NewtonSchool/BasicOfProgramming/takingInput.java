package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {

//        create a object of Scanner class

        Scanner sc = new Scanner(System.in);

//        taking input

//        integer input:-
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();

//        char input :-
        char c = sc.next().charAt(0);

//        boolean input : -
        boolean bool = sc.nextBoolean();

//        String input :-
        String s1 = sc.nextLine();

        String s2 = sc.next();
    }
}
