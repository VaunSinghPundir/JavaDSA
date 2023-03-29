package NewtonSchool.String;

import java.util.Scanner;

public class lucky_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String num = sc.nextLine();

        int sum = 0;


        for(int i = 0; i < n; i++){
            int digit = num.charAt(i) - '0';
            sum += digit;
        }

        for(int i = n; i < (2 * n); i++) {
            int digit = num.charAt(i) - '0';
            sum -= digit;
        }

        if(sum == 0){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("UNLUCKY");
        }
    }
}
