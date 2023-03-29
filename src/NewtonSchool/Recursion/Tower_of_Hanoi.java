package NewtonSchool.Recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {

    static void hanoi(int n, char source , char helper , char destination){
        if (n==1){
            System.out.println("1:" + source+ "->"+ destination);
            return;
        }
        hanoi(n-1,source,destination,helper);
        System.out.println(n + ":" + source + "->" + destination);
        hanoi(n-1,helper,source,destination);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        hanoi(n,'A','B', 'C');
    }
}
