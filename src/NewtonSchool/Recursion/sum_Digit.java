package NewtonSchool.Recursion;

public class sum_Digit {

    static int sumdigit(int n){
        if (n==0){
            return n;
        }
        return n%10 + sumdigit(n/10);
    }
    public static void main(String[] args) {

        int ans = sumdigit(1342);

        System.out.println(ans);

    }
}
