package NewtonSchool.Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
public class Even_Odd_Seprate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
////
        Stack<Integer> even= new Stack<>();
        Stack<Integer> odd= new Stack<>();

        long n = 7;

        int[] arr = {0, 4, 5, 3, 7, 2, 1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.push(arr[i]);
            }else{
                odd.push(arr[i]);
            }
        }
        int []oddArr = new int[odd.size()];
        int []evenArr = new int[even.size()];

        for(int i=0;i<oddArr.length;i++){
            oddArr[i] = odd.pop();
        }
        for(int i=0;i<evenArr.length;i++){
            evenArr[i] = even.pop();
        }
        Arrays.sort(oddArr);
        Arrays.sort(evenArr);

        int x = oddArr.length;
        int temp = 0;
        for (int i=0;i<x/2;i++){
            temp = oddArr[i];
            oddArr[i] = oddArr[x-i-1];
            oddArr[x-i-1] =  temp;
        }
        for(int i:oddArr){
            System.out.print(i+" ");
        }
        for(int i:evenArr){
            System.out.print(i+" ");
        }




//
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//        }



//        Arrays.sort(arr);

//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 1; j < n - i; j++) {
//
//                if (arr[j] > arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i<n; i++){
//            if (arr[i]%2 != 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 1; j < n - i; j++) {
//
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
////        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
    }
}
