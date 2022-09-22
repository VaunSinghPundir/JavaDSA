package Loop;

import java.util.Scanner;

public class marksGrade {
    public static void main(String[] args) {
                int input;
                Scanner sc = new Scanner(System.in);

        do {
            int marks = sc.nextInt();{
                if (marks>=90 && marks<= 100){
                    System.out.println("This is good");
                } else if (marks>= 60 && marks <= 89) {
                    System.out.println("This is also good");
                } else if (marks>=35 && marks<=59) {
                    System.out.println("This is good as well");
                }else {
                    System.out.println("need to progress");
                }

            }
            System.out.println("if you want to continue to press(1) or No press(0)");
            input = sc.nextInt();
        }while (input==1);
    }
}
