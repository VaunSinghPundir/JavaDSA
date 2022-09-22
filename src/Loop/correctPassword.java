package Loop;

import java.util.Scanner;

public class correctPassword {
    public static void main(String[] args) {


        int password;

        do {
            System.out.println("Write password");
            Scanner sc = new Scanner(System.in);
            password = sc.nextInt();
        } while (password != 8819);
    }
}