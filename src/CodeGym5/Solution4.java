package CodeGym5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String s = reader.readLine();
        list.add(Integer.parseInt(s));


        int count = 1;
        int max = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
        }
        if (max > count) {
            count = max;
        }
        System.out.println(count);
    }
}
