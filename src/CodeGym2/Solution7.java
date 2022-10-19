package CodeGym2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution7 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }

        String maxSizeElement = strings.get(0);
        for (String elemnt : strings){
            if(elemnt.length() > maxSizeElement.length()) {
                maxSizeElement = elemnt;
            }
        }
        for (String element : strings){
            if(element.length() == maxSizeElement.length()) {
                System.out.println(element);
            }
        }
    }
}
