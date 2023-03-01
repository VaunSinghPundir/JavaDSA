package NewtonSchool.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count_Frequency {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //        example as input : -  [1 2 4 3 5 4 3]

        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }


        Collections.sort(arrayList);
        System.out.println(arrayList);

        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
            int freq = Collections.frequency(arrayList,arrayList.get(i));

        }
        System.out.println();
    }
}
