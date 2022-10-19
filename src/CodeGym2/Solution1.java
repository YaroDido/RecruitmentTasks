package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] tablica = new int [15];
        for ( int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        int suam = 0;
        int suma1 = 0;

        for (int i =0; i < 15; i++) {
            if (i % 2 == 0){
               suam += tablica[i];
            } else {
                suma1 += tablica[i];
            }
        }
        if (suam > suma1){
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");

        } else if (suma1 > suam) {
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");

        }

    }
}
