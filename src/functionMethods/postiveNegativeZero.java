package functionMethods;

import java.util.Scanner;

public class postiveNegativeZero {


    //                         question : count p++,n--,zero


        public static void main(String[] args) {
            int positve = 0;
            int negative = 0;
            int zero = 0;
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int []arr = new int[size];
            int n = arr.length;
            for (int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i=0;i<arr.length;i++){
                if(arr[i]<0){
                    negative++;
                }else if (arr[i]>0){
                    positve++;
                }else {
                    zero++;
                }
            }
            System.out.println("zeros are = "+ zero + "\npositive are = "+ positve+"\n neg are = "+negative);


    }
}
