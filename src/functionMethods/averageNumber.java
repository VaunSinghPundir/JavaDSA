package functionMethods;

import java.util.Scanner;

public class averageNumber {
    public static int avarage (int a,int b,int c) {

        return (a + b + c)/3;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = avarage(a,b,c);
        System.out.println(sum);
    }
}
