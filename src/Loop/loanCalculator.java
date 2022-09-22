package Loop;

import java.util.Scanner;

public class loanCalculator {
    public static void main(String[] args) {

        //            loan calcualator


        Scanner sc = new Scanner(System.in);
        int n = 3;
        int amount = 20000;
        int sum;

        for (int i=0;i<3;i++){
            sum = amount*90/100;
            System.out.println(sum);
            amount = sum;

        }
    }
}
