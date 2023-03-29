package NewtonSchool.String;

import java.util.Scanner;

public interface Conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String a = sc.nextLine();

            String firstletter = a.substring(0,1).toUpperCase();
            String lastletter = a.substring(1).toLowerCase();

            String s = firstletter + lastletter;

            System.out.print(s);

        }
    }
}