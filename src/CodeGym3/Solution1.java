package CodeGym3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tekst = reader.readLine();
            list.add(tekst);
        }

        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}