package Basic;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int column = sc.nextInt();
//        int [][] number = new int[row][column];
//        for (int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//                number[i][j] = sc.nextInt();
//            }
//        }
//        int x = sc.nextInt();
//
//        for (int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//                if (number[i][j]==x){
//                    System.out.print("x found at location "+i+","+j );
//                }
//            }
//        }


        // spiral order matrix

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][] arr = new int [n][m];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int minr = 0;
//        int minc = 0;
//        int maxr = arr.length-1;
//        int maxc = arr[0].length-1;
//        int total = n * m;
//        int count = 0;
//
//        while (count<total) {
//            // left line
//            for (int i = minr, j = minc; i <= maxr && count<total; i++) {
//                System.out.print(arr[i][j]+" ");
//                count++;
//            }
//            minc++;
//            // bottom line
//            for (int i = maxr, j = minc; j <= maxc && count<total; j++) {
//                System.out.print(arr[i][j]+" ");
//                count++;
//            }
//            maxr--;
//            // right line
//            for (int i = maxr, j = maxc; i >= minr && count<total ; i--) {
//                System.out.print(arr[i][j]+" ");
//                count++;
//            }
//            maxc--;
//            // top line
//            for (int i = minr,j = maxc; j>=minc && count<total ; j--){
//                System.out.print(arr[i][j]+" ");
//                count++;
//            }
//            minr++;
//        }


        // question :  matrix in transpose


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][] arr = new int [n][m];
//
//        for (int i=0;i< arr.length;i++){
//            for (int j = 0; j<arr[0].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int j = 0;j<arr[0].length;j++) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//

//
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int x = 1;
//            for (int k = 0; k < n; k++) {
//                a = a + x * b;
//                System.out.print(a + " ");
//                x = x * 2;
//
//            }
//            System.out.println();
//        }


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                //Complete the code
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}



