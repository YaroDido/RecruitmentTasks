package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Silution11 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        String minSizeElement = list.get(0);
        int posMinElement = 0;
        String maxSizeElement = list.get(0);
        int posMaxelement = 0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minSizeElement.length()) {
                minSizeElement = list.get(i);
                posMinElement = i;
            } else if(list.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = list.get(i);
                posMaxelement = i;
            }
        }
        if (posMinElement < posMaxelement) {
            System.out.println(minSizeElement);
        } else if (posMinElement > posMaxelement) {
            System.out.println(maxSizeElement);
        }
    }
}
