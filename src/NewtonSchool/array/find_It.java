package NewtonSchool.array;

import java.util.Scanner;

public class find_It {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

//         k = x2 + 3*x;

        long x = 0;

        long num = 0;

        while (num<=n) {

            num = (x*x) + (3 * x);


            if (num==n) {
                System.out.println(x);
                break;
            }
            x++;

        }
        if (num!=n){
            System.out.println("-1");
        }
    }
}
