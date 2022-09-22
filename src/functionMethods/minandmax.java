package functionMethods;

import java.util.Scanner;

public class minandmax {



  //  Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

    static int max (int a,int b ,int c){
        int max = a ;
        if(b>a){
            max = b;
        }
        if (c>a){
            max= c;
        }
        return max;
    }
    static int min (int a ,int b ,int c){
        int min = a;
        if(b<a){
            min=b;
        }
        if(c<a){
            min = c;
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number");
        int a = sc.nextInt();

        System.out.println("enter your second number");
        int b = sc.nextInt();

        System.out.println("enter your third number");
        int c = sc.nextInt();

        System.out.println("max number is : " +max(a,b,c));
        System.out.println("min number is : " +min(a,b,c));
    }
}
