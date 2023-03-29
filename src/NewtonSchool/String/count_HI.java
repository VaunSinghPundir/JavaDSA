package NewtonSchool.String;

import java.util.Scanner;

public class count_HI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String str = sc.nextLine();
        String str = "hithisishimalayahigh";

        int count =0;

        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)=='h' && str.charAt(i+1)=='i'){
                count++;
            }
        }
        System.out.println(count);
    }
}
