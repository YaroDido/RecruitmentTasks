package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] liczba = new int [20];
        for (int i = 0; i < liczba.length; i++) {
            liczba[i] = Integer.parseInt(reader.readLine());
        }
        int[] small = new int [10];
        int[] small2 = new int [10];
        for ( int i = 0; i < 10; i++) {
            small[i] = liczba[i];
            small2[i] = liczba[i + 10];

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(small2[i]);
        }
    }
}
