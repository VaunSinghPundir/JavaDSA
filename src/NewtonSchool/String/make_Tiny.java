package NewtonSchool.String;

import java.util.Arrays;

public class make_Tiny {
    public static void main(String[] args) {

        String s = "school";
        String t = "newton";

//        String s = "efgh";
//        String t = "abcd";
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<s.length();i++){
            ch1[i] = s.charAt(i);
//            Arrays.sort(a);

            if (min > ch1[i]){
                min = ch1[i];
            }
        }

        for (int i=0;i<t.length();i++){
            ch2[i] = t.charAt(i);
//            Arrays.sort(b);

            if (max < ch2[i]){
                max = ch2[i];
            }

        }

        if (min < max) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

//        if (a[0] < b[t.length()-1]){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("No");
//        }







    }
}
