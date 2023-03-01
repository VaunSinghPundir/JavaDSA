package NewtonSchool.array;

public class Sprial_Matrix {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int row = 3;
        int col = 3;

//        Scanner sc = new Scanner(System.in);
//
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        int [][] arr = new int [row][col];
//
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }



        int top = 0, down = row -1, left = 0 , right = col-1, dir = 0;

        while(top <= down && left <= right){
            if (dir == 0){
                for (int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;

            }
            else if (dir == 1) {
                for (int i=top;i<=down;i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;

            }
            else if (dir == 2) {
                for (int i=right;i>=left;i--){
                    System.out.print(arr[down][i]+" ");
                }
                down--;

            }
            else if (dir == 3){
                for (int i=down;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;

            }
            dir= (dir + 1)% 4;


        }
    }
}
