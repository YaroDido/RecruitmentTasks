package CodeGym3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] data = new int [20];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maksimum = data[0];
        int minimum = data[0];

        for (int i = 0; i < data.length; i++) {
            if ( data[i] > maksimum) {
               maksimum = data[i];
            }
            if (data [i] < minimum) {
                minimum = data[i];
            }
        }



        System.out.print(maksimum + " " + minimum);
    }
}