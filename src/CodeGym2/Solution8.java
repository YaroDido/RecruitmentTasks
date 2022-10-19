package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        String minSizeElement = list.get(0);
        for (String element : list) {
            if (element.length() < minSizeElement.length()) {
                minSizeElement = element;
            }
        }

            for (String element : list) {
                if (element.length() == minSizeElement.length()) {
                    System.out.println(element);
                }
            }
        }
    }

