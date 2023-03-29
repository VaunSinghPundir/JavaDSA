package NewtonSchool.Sorting;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Implementing_BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i=0; i<arr.length-1;i++){
                for (int j=0;j<arr.length-i-1;j++){
                    if (arr[j]>arr[j+1]){
                        /// Swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            for (int i=0;i<arr.length; i++){

                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
