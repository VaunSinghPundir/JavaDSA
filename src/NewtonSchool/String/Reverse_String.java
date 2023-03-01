package NewtonSchool.String;

import java.util.Scanner;

public class Reverse_String {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char []ch = new char[str.length()];

        for(int i=0;i<str.length();i++){
            ch[i]= str.charAt(i);
        }

        int n = ch.length;
        int temp = 0;
        for (int i=0;i<n/2;i++){
            temp = ch[i];
            ch[i] = ch[n-i-1];
            ch[n-i-1] = (char) temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(ch[i]);
        }

    }

}
