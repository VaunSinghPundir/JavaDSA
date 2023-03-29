package NewtonSchool.General_Math;

public class Max_PrimeNumber_In_Range {

    static boolean isprime(int n){
        if(n==1||n==0) return false;
        for(int i = 2; i < n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    static int maxvalue(int n,int m){

        int max = -1;

        for(int i = n ; i <= m; i++){
            if (isprime(i)){

                if (max<i){
                    max = i;
                }
            }

        }

        return max;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 10;


        System.out.print(maxvalue(n,m));
    }
}
