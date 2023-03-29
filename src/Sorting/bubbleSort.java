package Sorting;

public class bubbleSort {

                  //   Question :  bubble sorting

        public static void bubblearr (int arr[]){

            for (int i=0;i<arr.length; i++){

                System.out.print(arr[i]+" ");
            }

        }
        public static void main(String[] args) {
            int arr [] = {2,5,9,6,1,0,6};

            for (int i=0; i<arr.length-1;i++){
                for (int j=0;j<arr.length-i-1;j++){
                    if (arr[j]>arr[j+1]){
                        /// Swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            bubblearr(arr);
        }

}
