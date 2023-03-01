package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class Next_and_NextLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        String str1 = sc.next();

//        it is use for next line

        sc.nextLine();

        String str2 = sc.nextLine();

        System.out.println("i : "+ i);
        System.out.println("str1 :" + str1);
        System.out.println("str2 : "+ str2);
    }
}
