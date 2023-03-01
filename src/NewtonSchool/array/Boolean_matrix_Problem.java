package NewtonSchool.array;

import java.util.Scanner;

public class Boolean_matrix_Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            int row = sc.nextInt();
            int colomn = sc.nextInt();

            int[][] arr = new int[row][colomn];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colomn; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i=0;i<row;i++){

                boolean flag = false;

                for(int j=0;j<colomn;j++) {
                    if (arr[i][j] == 1) {
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    for(int j=0;j<colomn;j++){
                        arr[i][j] = 1;
                    }
                }
            }
            for (int i=0;i<row;i++){
                for (int j=0;j<colomn;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
