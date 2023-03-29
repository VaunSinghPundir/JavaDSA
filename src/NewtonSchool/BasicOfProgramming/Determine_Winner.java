package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class Determine_Winner {
    public static void main(String[] args) {


//        Sample Input :
//      4
//      5 10 2 12
//      10 30 15 15
//      20 8 4 20
//      6 6 6 6

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t--> 0) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            int q1 = sc.nextInt();
            int q2 = sc.nextInt();

            if (p1 != q1 && p1 != q2 && p2 != q1) {

                if (p2 < q2) {
                    System.out.println("P");
                } else if (q2 < p2) {
                    System.out.println("Q");
                }
            }
            else if(p1 == q1 || p2 == q2 || p2 == q1){
                System.out.println("TIE");
            }
            else {
                System.out.println("TIE");
            }
        }
    }
}
