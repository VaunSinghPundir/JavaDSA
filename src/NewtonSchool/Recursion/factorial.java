package NewtonSchool.Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = factor(5);

        System.out.println(n);
    }

    private static int factor(int n){
        if (n==1){
            return 1;
        }

        return n * factor(n-1);
    }
}
