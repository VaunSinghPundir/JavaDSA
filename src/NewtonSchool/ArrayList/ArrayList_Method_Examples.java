package NewtonSchool.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Method_Examples {
    public static void main(String[] args) {

        //         creating a ArrayList

        ArrayList<Integer> arrayList = new ArrayList<>();


//        example of arrayList : -

//        int i = 10;
//        Integer iobj = i;
//
//        Integer ivar = iobj;
//
//
//        System.out.println("i : " + i );
//        System.out.println("iobj : "+ iobj);
//        System.out.println("ivar : "+ ivar);


//         Storing data in an ArrayLIst :-

//         (add.(value)  :- amend the value after the first value
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(-30);

        System.out.println(arrayList);


//        (add.(Index,value) : - add the value at any index position
        arrayList.add(0,100);
        System.out.println(arrayList);



//        size of arrayList : -
        int size = arrayList.size();
        System.out.println(size);



//        get() :- accesing the element at ith- index  : -
        int fourthindex = arrayList.get(2);
        System.out.println(fourthindex);



//        arrayList show an error because its size is 3 : -
//        arrayList.add(6,400);
//        System.out.println(arrayList);


//       remove an index element in arraylist : -
        arrayList.remove(3);
        System.out.println(arrayList);

//        remove direct element in an arraylist :-
        Integer remove = 100;
        arrayList.remove(remove);
        System.out.println(arrayList);



//       add again arraylist in (new arraylist) : -
        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(1);
        newlist.add(2);
        newlist.add(3);
        newlist.addAll(arrayList);
        newlist.addAll(1,arrayList);
        System.out.println("arraylist : "+ newlist);


//        .contain arraylist : -
        boolean present =  arrayList.contains(10);
        boolean present1 = arrayList.contains(30);
        System.out.println(" is 10 present in array : " + present);
        System.out.println(" is 10 present in array : " +present1);



//        .indexof()first appearence  &&   .(lastIndexof) for the last index of an string
        int index = arrayList.indexOf(10);
        int index1 = arrayList.indexOf(100);
        System.out.println("is index 20 present in array : " + index);
        System.out.println("is index 100 present in array : " + index1);



//      empty() :-  it
//        it will empty after the clear function
        boolean empty = arrayList.isEmpty();
        System.out.println("is array empty : " + empty);



//         set() it will replace the value :-
        arrayList.set(1,-100);
        System.out.println("arraylist replaceing 20 with -100 : " + arrayList);

//        it will show an error bcs array out of bound : -
//        arrayList.set(10,10000);
//        System.out.println(arrayList);



//        toarray() : - it will make an array
        Object [] arr = arrayList.toArray();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();



//         another toarray(T) is convert object array in integer array : -
        Integer intarraylist[] = new Integer[arrayList.size()];
        arrayList.toArray(intarraylist);
        System.out.println("intarraylist ");
        for (int i=0;i<intarraylist.length;i++){
            System.out.print(intarraylist[i]+ " ");
        }
        System.out.println();



//        sublist()
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        System.out.println("new array "  + arrayList);
        List<Integer> sublist = arrayList.subList(2,5);
        System.out.println("after sublist the array : " + sublist);


//        (frequency) it will the frequency of an element how many times number repeat : -
        arrayList.add(40);
        int frequency = Collections.frequency(arrayList, 40);
        System.out.println("check the frequecy : "+ frequency);


//         sort the arraylist : -
        Collections.sort(arrayList);
        System.out.println("sort array in increase order  : " +  arrayList);


//        reverse the arraylist in decrease order : -
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("array in reverse order : " + arrayList);





//       clear an array it become empty : -
//        arrayList.clear();
//        System.out.println(arrayList);
    }
}
