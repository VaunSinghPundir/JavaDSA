package NewtonSchool.array;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check = false;
        for(int i=0;i<n;i++) {
            if(arr[i]==d){
                check=true;
                break;
            }
        }
        if (check){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
