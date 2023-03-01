package BinarySearch;

public class peekElement {
    public static void main(String[] args) {

        //int []arr = {1,2,3,4,5,10,20,85,5,3};
        int [] arr = {1,2,1,3,5,6,4};
        System.out.println(findpeekelement(arr));
    }
    static int findpeekelement (int[] arr){

        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
