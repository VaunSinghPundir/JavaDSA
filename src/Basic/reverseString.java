package Basic;

public class reverseString {
    public static void main(String[] args) {

        String str = "hello there!";
        char[] arr = str.toCharArray();
        int n = arr.length;
        int l = n / 2;
        for (int i = 0; i < l; i++) {
            char temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (char ele : arr) {
            System.out.print(ele);
        }
    }
}

