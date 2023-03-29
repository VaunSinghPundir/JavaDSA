package NewtonSchool.String;

import java.util.Locale;
import java.util.Scanner;

public class Pangram_checking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int tc = sc.nextInt();

//        while (tc-- > 0) {

            String s = "Bawdsjogflickquarxtzvenymph";
            String str = s.toLowerCase();

            if (str.length() < 26) {
                System.out.println("0");
            }
            else {
                boolean flag = true;
                for (char ch = 'a'; ch <= 'z'; ch++) {
                     if (str.indexOf(ch)>0){
                         flag = false;
                     }
                }
                if (flag) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
//        }
    }
}


