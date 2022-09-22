package Basic.practiceQuestion;

import java.util.Scanner;

public class maxormin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int size = sc.nextInt();
//
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        int [] a = new int [size];
//
//        for (int i = 0; i < size; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0 ;i< size; i++){
//            if (min> a[i]){
//                min = a[i];
//            }
//
//        }
//        System.out.println(min);
//        for (int i = 0 ; i<size; i++){
//            if (max<a[i]){
//                max= a[i];
//
//            }
//        }
//
//        System.out.println(max);

        int min = 1;
        int max = 1;

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;

        int[] a = new int [5];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
//        for (int i = 0; i<a.length; i++){
        for (int ele : a ){

            if (min>ele){
                min = ele;
            }
        }
        System.out.println(min);

        for (int i = 0; i<a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
