package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] tab = new String[10];
        for (int i = 0; i < 8; i++) {
            tab[i] = buffer.readLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(tab[i]);
        }

    }
}