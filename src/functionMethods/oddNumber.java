package functionMethods;

import java.util.Scanner;

public class oddNumber {


     //             question : sum of odd number

    public static int oddnumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddnumber(n);
    }
}

