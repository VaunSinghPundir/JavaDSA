package functionMethods;

import java.util.Scanner;

public class marksGrade {
    static void marks(int n) {

            if (n >= 91 && n <= 100) {
                System.out.println("Your grade is : AA");
            } else if (n >= 81 && n <= 90) {
                System.out.println("Your grade is : AB");
            } else if (n >= 71 && n <= 80) {
                System.out.println("Your grade is : BB");
            } else if (n >= 61 && n <= 70) {
                System.out.println("Your grade is : BC");
            } else if (n >= 51 && n <= 60) {
                System.out.println("Your grade is : CD");
            } else if (n >= 41 && n <= 50) {
                System.out.println("Your grade is : DD");
            } else {
                System.out.println("please try again : fail");
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your marks");
        int n = sc.nextInt();
        marks(n);
    }
}




