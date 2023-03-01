package NewtonSchool.array;

public class Sum_And_Mean {
    public static void main(String[] args) {

        int N = 5;
        int [] arr = {1,2,19,28,5};

        int sum = 0;

        for (int i = 0; i<N;i++){
            sum += arr[i];
        }

        int mean = sum / N;

        System.out.println(sum + " " + mean);
    }

}
