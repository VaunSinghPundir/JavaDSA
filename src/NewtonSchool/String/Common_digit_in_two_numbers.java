package NewtonSchool.String;

import java.util.Scanner;

public class Common_digit_in_two_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String str1 = sc.next();
//        String str2 = sc.next();

        String str1 = "24324345";
        String str2 = "3546434";


        for(int i=0;i<str1.length() && i<str2.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                System.out.print(str1.charAt(i)+" ");
            }
        }
    }
}
