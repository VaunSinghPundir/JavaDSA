import java.util.Scanner;

public class ifelseswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calender = sc.nextInt();

        switch(calender){
            case 1 :
                System.out.println("january");
                break;
            case 2 :
                System.out.println("febuarary");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5 :
                System.out.println("may");
                break;
            default:
                System.out.println("invalid");


        }


    }
}
