package Sorting;

public class selectionSort {


                   // Question :  selection sorting

    static void selectionarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 10, 8, 25, 4, 9, 3, 0, 5};
        //selection sorting
        for (int i = 0; i < arr.length; i++) {
            int smallest = 0;
            for (int j = i + 1; j < arr.length; j++) {
                smallest = i;
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        int temp = 0, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];

            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        selectionarr(arr);

    }
}