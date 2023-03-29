package NewtonSchool.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Count_Frequency {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //        example as input : -  [1 2 4 3 5 4 3]

        int n = sc.nextInt();

//        for (int i=0;i<n;i++){
//            arrayList.add(sc.nextInt());
//        }
//
//
//        Collections.sort(arrayList);
//        System.out.println(arrayList);


        int [] a = new int[n];
        int [] b = new int[n];

        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            }
        }
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }


        for (int i=0;i<n;i++){
            int c = 1;

            if (a[i]!=-1){
                for (int j=i+1;j<n;j++){

                    if (a[i]==a[j]){

                        c+=1;
                        a[j]=-1;
                    }
                }
                b[i]=c;
            }
        }
        for (int i=0;i<n;i++){

            if (a[i]!=-1){
                System.out.println(a[i] + " " + b[i]);
            }
        }

    }
}
