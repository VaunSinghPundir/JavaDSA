package NewtonSchool.Sorting;

import java.util.Scanner;

public class Selection_Sort_Method1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int length = arr.length;

        for(int i = 0; i < length-1; i++){

            int minindex = i;

            for(int j = i+1; j<length; j++){
                if(arr[j] < arr[minindex]){
                    minindex = arr[j];
                }
            }

            int temp = arr[i];
            arr[i] = minindex;
            minindex = temp;

        }


        for(int i = 0 ; i < length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
