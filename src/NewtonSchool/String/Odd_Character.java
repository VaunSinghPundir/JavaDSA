package NewtonSchool.String;

import java.util.Scanner;

public class Odd_Character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.toLowerCase();

        char [] ch = new char [str2.length()];

        for(int i=0;i<str2.length();i++){
            ch[i] = str2.charAt(i);
        }
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
