package NewtonSchool.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Element_Index {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }

        int k = sc.nextInt();

        int index = arrayList.indexOf(k);
        System.out.println(index);
    }
}
