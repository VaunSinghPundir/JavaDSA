package functionMethods;

import java.util.Scanner;

public class circumferenceofCircle {
    //question : cercumference of circle


    public static double cercumference (double r){
        return 2*3.14*r;
    }
    public static void main (String [] args){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("circumference of circle is : " + cercumference(r));
    }
}

