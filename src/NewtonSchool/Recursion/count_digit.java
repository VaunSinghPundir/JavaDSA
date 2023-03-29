package NewtonSchool.Recursion;

import java.util.Scanner;

public class count_digit {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            String n = sc.next();
            System.out.println(count(n));
        }
    }
    static int  count(String str){
        if(str.length()==0) return 0;
        return str.length();
    }
}

//        int tc = sc.nextInt();
//
//        int count = 1;
//
//        while(tc-- >0){
//
//            String n = sc.next();
//
//
//            char [] ch = n.toCharArray();
//
//        for(int i=0;i<n.length();i++){
//            ch[i] = n.charAt(i);
//        }
//
//        for(int i=0;i<ch.length;i++){
//            count = i+1;
//        }
//            System.out.println(count);
//
//        }
//    }

//    private static int countdigit(String n,int tc){
//
//
//        while(tc-- >0){
//
//            int count = 1;
//
//            for(int i=0;i<n.length();i++){
//                count += count + i;
//            }
//            System.out.println(count);
//        }
//        return countdigit(n,tc);
//        // Your code here
//    }
//}