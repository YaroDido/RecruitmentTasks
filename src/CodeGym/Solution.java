package CodeGym;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        double suma = 0;
        int liczba = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                System.out.println(suma / liczba);
                return;
            }
            liczba++;
            suma += a;
        }

    }
}
