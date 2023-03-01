package BinarySearch;

import java.lang.module.FindException;

public class mountainArray {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search (int [] arr, int target ){
        int peek = findpeekelement(arr);
        int first = binarysearch(arr,target, 0, peek);
        if (first !=-1){
            return first;
        }
        return binarysearch(arr,target,peek+1,arr.length -1);
    }

    static int findpeekelement (int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int binarysearch(int[] arr, int target , int start,int end) {

        boolean isAss = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAss) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // mid is equal to target
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    // mid is equal to target
                    return mid;
                }
            }
        }
        // target is not found
        return -1;
    }
}
