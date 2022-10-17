package BinarySearch;

import java.util.Arrays;

public class fristAndLastPostitionElementAnArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(firstandlastarray(nums,target)));
    }

    static int[] firstandlastarray(int[] nums, int target) {

        int[] arr = new int[2];
        arr[0] = findfirst(nums, target);
        arr[1] = findlast(nums, target);
        return arr ;
    }
    static int findfirst(int[] nums, int target) {

        int position = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                position = mid;
                end = mid - 1;
            }

        }
        return position;
    }
    static int findlast (int [] nums, int target){
        int position = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if (target >nums[mid]){
                start = mid +1;
            }else{
                position = mid;
                start = mid +1;
            }
        }
        return position;
    }
}

