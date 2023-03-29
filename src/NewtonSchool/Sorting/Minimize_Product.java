package NewtonSchool.Sorting;

import java.util.Scanner;

public class Minimize_Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] num1 = new int [n];

        int [] num2 = new int [n];

        for(int i = 0; i < n; i++){
            num1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            num2[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < num1.length; i++){
            sum += num1[i];
        }

        int product = 1;

        for (int i = 0; i < num1.length-1; i++){
            for (int j = 0; j < num2.length-1; j++){

                product = num1[i] * num2[j];

                if (sum < product){
                    int temp = num1[j];
                    num1[j] = num1[j +1];
                    num1[j+1] = temp;
                }
            }
        }

        System.out.println(product);


    }
}
