package HackerRank;

import java.util.Scanner;

public class Java_Currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double payment = sc.nextDouble();

        char c = sc.next().charAt(0);


        String India = "Rs.";
        char US = '$';
        char France = '€';
        char China = '¥';
        System.out.println("US: " + US+ payment);
        System.out.println("India: " + India+payment);
        System.out.println("China: " +China+payment);
        System.out.println("France: " + payment+" "+France);



//        US: $12,324.13
//        India: Rs.12,324.13
//        China: ￥12,324.13
//        France: 12 324,13 €

    }
}
