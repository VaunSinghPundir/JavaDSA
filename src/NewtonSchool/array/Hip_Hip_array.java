package NewtonSchool.array;

import java.util.Scanner;

public class Hip_Hip_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int sum = 0;
        long multi = 1;

        int [] arr = new int [size];

        for (int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();

        }

//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        System.out.println();


        for (int i=0;i < (size/2);i++){
            int j = size - 1 -i;

//            swap array

           int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//        for (int i = 0;i<size;i++) {
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println();

        for (int i=0;i<arr.length;i++){
            if (i%2!=0){
                sum = sum + arr[i];
            }
            else {
                multi = multi* arr[i];
            }
        }

        System.out.println(sum +" " + multi);







    }
}
