package Arena_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Finite_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 100000;

        for(int i=0;i<n;i++){

            int a = sc.nextInt();
            System.out.print(a+" ");

            if (a==0){
                break;
            }
        }
    }
}
