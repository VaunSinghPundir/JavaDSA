package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);    //initialcapacity doesn,t matter;

        Scanner sc = new Scanner(System.in);

//        list.add(55);
//        list.add(41);
//        list.add(78);
//        list.add(8);
//        list.add(95);
//        list.add(4);
//        list.add(5);

//        System.out.println(list);

        // To check the value on index :  (list.contains)

//        System.out.println(list.contains(41));

        // to add new value at same index : (list.add)

//        list.set(0,99);
//        System.out.println(list);

        // to remove index : (list.remove).

//        list.remove(3);
//        System.out.println(list);


        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        // get item of any index
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));  // list of [index]:  syntex will not work here
        }
        System.out.println(list);

    }

}
