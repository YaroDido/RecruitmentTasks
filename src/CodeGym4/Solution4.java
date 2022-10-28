package CodeGym4;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Sim", "Sim");
        mapa.put("Tom", "Tom");
        mapa.put("Arbus", "Arbus");
        mapa.put("Dzieciak", "Dzieciak");
        mapa.put("Kot", "Kot");
        mapa.put("Pies", "Pies");
        mapa.put("Je", "Je");
        mapa.put("Jedzonko", "Jedzonko");
        mapa.put("Gevey", "Gevey");
        mapa.put("Przytulas", "Przytulas");

        printWartosci(mapa);
    }

    public static void printWartosci(Map<String, String> mapa) {

        for(String scam : mapa.values()) {
            System.out.println(scam);
        }
    }
}
