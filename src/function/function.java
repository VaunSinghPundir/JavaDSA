package function;

import java.util.Scanner;

public class function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = sc.nextLine();

     String greeting = myname(name);
     System.out.println(greeting);

    }

    static String myname (String name){
       String intro = "How are you  : "+ name;
       return intro;
    }

     static int sum () {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter first number");
         int a = sc.nextInt();
         System.out.println("enter second number");
         int b = sc.nextInt();
         int add = a + b;
         return add;

     }

    }