package NewtonSchool.BasicOfProgramming;

import java.util.Scanner;

public class newton_And_His_Picture {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int n = sc.nextInt();

        while(n-->0){
            int w = sc.nextInt();
            int h = sc.nextInt();

            if(l>w || l>h){
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w==h){
                System.out.println("ACCEPTED");
            }
            else{
                System.out.println("CROP IT");
            }
        }
    }
}
