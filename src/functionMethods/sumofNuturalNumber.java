package functionMethods;

import java.util.Scanner;

public class sumofNuturalNumber {

    static int nNum (int n){
        int count = 0;
        for (int i=1;i<=n;i++){
            count = count+i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nNum(n));

    }

}
