package NewtonSchool.String;

import java.util.Scanner;

public class OR_Counting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int length = a.length();

        int count = 1;

        for (int i=0;i<length;i++){

            char ach = a.charAt(i);

            char bch = b.charAt(i);

            if (ach =='1' && bch == '1'){
                count = count * 2;
            }
            else if(ach =='1' && bch == '0'){
                count = 0;
            }
        }
        System.out.println(count);
    }
}
