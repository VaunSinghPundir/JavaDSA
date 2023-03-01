package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class DoctorClinic {
    public static void main(String[] args) {

 //        question : - Given an integer n, For each i (1<=i<=n) if i is even print "even" else print "odd".
//        Print even or odd for each i, separated by white spaces.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if (i%2==0){
                System.out.print("even"+" ");
            }
            else{
                System.out.print("odd"+" ");
            }
        }
    }
}
