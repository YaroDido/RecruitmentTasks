package CodeGym3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String tekst = reader.readLine();
            if (tekst.equals("koniec")) {
                break;
            }
            list.add(tekst);

        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
