package NewtonSchool.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rotated_Sorted_Array {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for (int k=0;k<t;k++) {
            String nandm = bufferedReader.readLine();
            int m = Integer.parseInt(nandm.split(" ")[0]);
            int n = Integer.parseInt(nandm.split(" ")[1]);


            String zero = "";
            String ones = "";

            for (int i = 0; i < n; i++) {
                ones = ones + "1 ";
                zero = zero + "0 ";
            }

            for (int j = 0; j < m; j++) {

                String row = bufferedReader.readLine();

                if (row.contains("1")) {
                    System.out.println(ones);
                } else {
                    System.out.println(zero);
                }
            }
        }
    }
}
