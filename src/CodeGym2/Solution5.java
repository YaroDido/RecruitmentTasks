package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] slowa = new String[10];
        int[] liczb = new int[10];

        for (int i = 0; i < 10; i++) {
            slowa[i] = reader.readLine();
            liczb[i] = slowa[i].length();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(liczb[i]);
        }
    }
}