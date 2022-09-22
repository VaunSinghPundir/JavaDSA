package Basic;

import java.util.Scanner;

public class numberPower {

    //question :  number power

    public static void main(String[] args) {
        System.out.println("enter your power,cube,etc.. number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter your number");
        int x = sc.nextInt();
        int result = 1;
        for (int i=0;i<n;i++){
            result = result*x;
        }
        System.out.println("result is : " + result);
    }
}
