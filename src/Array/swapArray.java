package Array;

import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    static void swap (int [] arr, int index1,int index3){
        int temp = arr [index1];
        arr [index1] = arr[index3];
        arr [index3] = temp;
    }
    public static void main(String[] args) {
        int []arr = {1,5,6,7};
        swap( arr, 0,2);
        System.out.println(Arrays.toString(arr));
    }
}

