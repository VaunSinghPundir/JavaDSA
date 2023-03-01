package NewtonSchool.array;

import java.util.Scanner;

public class check_1s_And_0s {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int count0 = 0;
        int count1 = 0;

        int [] arr = new int [size];
        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<size;i++){
            if (arr[i] == 1 ){
                count1++;
            }else if(arr[i]==0){
                count0++;
            }
        }
        System.out.println(count1 + " " + count0);
    }
}
