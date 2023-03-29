package NewtonSchool.Recursion;

public class reverseString {

    public static void reverseString(char[] s) {

        if (s.length == 0) {
            return;
        }

        System.out.println(s.length-1);

        reverseString(s);

    }

        public static void main(String[] args) {

//        char [] s = {"h","e","l","l","o"};
//        int n = s.length;
//
//        reverseString(s);
    }
}
