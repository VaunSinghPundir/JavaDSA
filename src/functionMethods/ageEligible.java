package functionMethods;
import java.util.Scanner;
public class ageEligible {


             //         question : age eligible for vote

    public static boolean agevote(int age){
        if (age>18){
            return true;
        }else {
           return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(agevote(age));
    }
}
