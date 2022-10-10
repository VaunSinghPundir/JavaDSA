package BinarySearch;

public class findNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 12, 22, 33, 45, 50};
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // mid is equal to target
                return mid;
            }
        }
        // array is not found
        return -1;
    }
}
