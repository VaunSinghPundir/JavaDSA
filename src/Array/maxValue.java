package Array;

public class maxValue {
    static int maxvalue(int [] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {2,5,9,4,25,5};
        System.out.println(maxvalue(arr));
    }
}
