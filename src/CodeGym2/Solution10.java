package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution10 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String s = list.remove(4);
            list.add(0, s);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}


