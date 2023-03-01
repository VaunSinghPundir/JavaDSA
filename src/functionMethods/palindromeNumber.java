package functionMethods;
import java.util.Scanner;
public class palindromeNumber {
    static boolean palinum(int a) {
        int temp = Math.abs(a);
        int rev = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return a == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println(palinum(a));
    }
}

