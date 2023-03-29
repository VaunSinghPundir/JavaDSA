package NewtonSchool.Recursion.divide_and_Conquer;

public class XpowerY {

    private static int power (int x, int y) {
        if (y == 0) {
            return 1;
        }

        int xpoweryby2 = power(x,y/2);

        int result ;
//        if (y % 2 == 0) {
//
//            result = xpoweryby2 * xpoweryby2;
//        }else {
//            result = xpoweryby2 * xpoweryby2 * x;
//        }

        result = xpoweryby2 * xpoweryby2;

        if (y % 2 == 1) {

            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        System.out.println(power(x,y));
    }
}
