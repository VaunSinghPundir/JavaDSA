package Basic;

import java.util.Scanner;

public class seriesFibonacci {

    //                      question : fibonacci series

      public static void main(String[] args) {
          System.out.println("Enter your first number");
          Scanner sc = new Scanner(System.in);
          int n1 = sc.nextInt();
          System.out.println("Enter your second number");
          int n2 = sc.nextInt();
          int n3;

          System.out.println("number of length");
          int size = sc.nextInt();
          System.out.print(n1+" "+n2);

          for (int i=0;i<=size;i++){
              n3 = n1+n2;
              System.out.print(" "+n3);
              n1 = n2;
              n2 = n3;
          }
      }
}
