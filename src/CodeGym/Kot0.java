package CodeGym;

import java.util.ArrayList;
import java.util.Arrays;

public class Kot0 {
    public static ArrayList<Kot> koty = new ArrayList<>();

    public Kot0() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            koty.add(new Kot());
        }
        printKoty();
    }

    public static void printKoty() {
        for(int i = 0; i < 10; i++) {
            System.out.println(koty.get(i));
        }
    }
}

