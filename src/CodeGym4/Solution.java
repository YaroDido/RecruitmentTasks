package CodeGym4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] agrs) {
        HashSet<String> set = new HashSet<>();
        set.add("arbuz");
        set.add("banan");
        set.add("wiśnia");
        set.add("gruszka");
        set.add("kantalupa");
        set.add("jeżyna");
        set.add("żeńszeń");
        set.add("truskawka");
        set.add("irys");
        set.add("ziemniak");

        for (String tekst : set) {
            System.out.println(tekst);
        }
    }
}
