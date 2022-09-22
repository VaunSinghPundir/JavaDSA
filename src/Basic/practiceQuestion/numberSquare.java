package Basic.practiceQuestion;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();                // l = square or cube ... etc .
        int [] sides = new int [length];
        for (int i=0;i< sides.length;i++){
            sides[i] = sc.nextInt();             //  i = number * number .
        }
        for (int i = 0;i<length;i++){
            System.out.println(sides[i]*sides[i]);
        }
    }
}
