package BinarySearch;

public class agnosticBinarySearch {

    public static void main(String[] args) {
        // array is in Assending order
       // int[] arr = {1, 2, 3, 5, 7, 9, 12, 22, 33, 45, 50};
        // int target = 22;
        // Array is in decending order
        int [] arr = {99,75,50,45,33,22,18,15,10,5,2,0};
        int target =75;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch (int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAss = arr[start] < arr[end] ;

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
            }
            else{
                if (target > arr[mid]) {
                end = mid - 1;
                }
                else if (target < arr[mid]) {
                start = mid + 1;}
                else {
                // mid is equal to target
                return mid;
                }
            }
        }
        // target is not found
        return -1;
        }
    }

