package NewtonSchool.array;

import java.util.Scanner;

public class Minimum_adjacent_difference_in_a_circular_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;

        while (t-->0){

            int n = sc.nextInt();

            int [] arr = new int[n];

            for (int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }

            int minidifference = Math.abs(arr[n-1] - arr[0]);

            for (int k=1;k<n;k++){
                int difference = arr[k] - arr[k-1];

                int absdifference = Math.abs(difference);

                if (absdifference<minidifference){
                    minidifference = absdifference;
                }
            }
            System.out.println(minidifference);
        }
    }
}
