package CodeGym4;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args)  {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("arbuz" , "melon");
        mapa.put("banan" , "owoc");
        mapa.put("wiśnia" , "owoc");
        mapa.put("gruszka" , "owoc");
        mapa.put("kantalupa" , "melon");
        mapa.put("jeżyna" , "owoc");
        mapa.put("żeńszeń" , "korzeń");
        mapa.put("truskawka" , "owoc");
        mapa.put("irys" , "kwiat");
        mapa.put("ziemniak" , "bulwa");

        for (Map.Entry<String, String> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " - " + para.getValue());
        }


    }
}



