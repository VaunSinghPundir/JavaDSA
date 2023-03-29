package NewtonSchool.array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }



            int length = arr.length;


            int max1 = Integer.MIN_VALUE;

            int max2 = Integer.MIN_VALUE;

            int max3 = Integer.MIN_VALUE;

            for (int i = 0; i < length; i++) {
            /* If current element is greater than
            first*/
                if (arr[i] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = arr[i];
                }

            /* If arr[i] is in between first and
            second then update second  */
                else if (arr[i] > max2) {
                    max3 = max2;
                    max2 = arr[i];
                }

                else if (arr[i] > max3)
                    max3 = arr[i];
            }

            System.out.println(max1 + " " + max2 + " " + max3);
        }



//            3
//            5
//            1 4 2 4 5
//            6
//            1 3 5 7 9 8
//            7
//            11 22 33 44 55 66 77


    }
}
