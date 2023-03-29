package NewtonSchool.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

         Arrays.sort(arr);

        for(int i = 0; i < n-1; i+=2){

            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
//
//            for(int j = 1; j < n-i; j++) {
//
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }

        }
        for(int i = 0; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
