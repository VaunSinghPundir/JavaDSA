package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Number_of_Distint_average {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        int size = 10;

        int[] nums = {9,5,7,8,7,9,8,2,0,7};

        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;

        int avg = 0;


        for (int i = 0; i<=n/2; i++){

                avg = (nums[i] + nums[n-i-1]);


            if(!ans.contains(avg)){
                ans.add(avg);
            }
        }

        System.out.println(ans.size());

//                [9,5,7,8,7,9,8,2,0,7]
    }
}
