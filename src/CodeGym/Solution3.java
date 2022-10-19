package CodeGym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        while (a > 0) {
            if (a % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
            a = a/10;


        }
        System.out.println("Parzysta:" + parzyste + " Nieparzysta:" + nieparzyste);
    }
}