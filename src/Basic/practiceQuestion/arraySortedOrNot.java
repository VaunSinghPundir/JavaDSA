package Basic.practiceQuestion;

import java.util.Scanner;

public class arraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        boolean check = true;
        for (int i = 0 ; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){ //8 2 4 5 7
                check =  false;
                break;
            }
        }
        if(check){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
