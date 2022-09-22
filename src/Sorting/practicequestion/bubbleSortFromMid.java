package Sorting.practicequestion;

public class bubbleSortFromMid {
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,9,0,2,7};
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        for (int i=0;i<arr.length-1;i++) {
            for (int j = mid; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int el:arr){
            System.out.print(el+" ");
        }

    }
}

