package NewtonSchool.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class D_triplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        int x = 3;

        int [] arr = {1, 8, 4, 2, 9};

        int length = arr.length;

//        int n = sc.nextInt();
//
//        int x = sc.nextInt();
//
//        int [] arr = new int[n];
//
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }

        Arrays.sort(arr);

        long count = 0;

        for (int i = 0; i<length; i++){

            for(int j = i+2; j < length-2; j++) {

                if (arr[j] - arr[i] <=x) {

                    count = count + (j - (i +1)) ;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(count);




//            for (int j = i + 1; j < n; j++){
//
//                for (int k = j + 1; k < n; k++){
//                    if ((arr[i] - arr[j] <=x) && (arr[i] - arr[k] <=x) && (arr[j] - arr[k] <=x)){
//                        count++;
//                    }
//                }
//            }

    }
}
