package CodeGym2;

import java.util.ArrayList;

/*
Co to za rodzaj listy?
*/

public class Solution6 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Dupa1");
        lista.add("Dupa2");
        lista.add("Dupa3");
        lista.add("Dupa4");
        lista.add("Dupa5");

        System.out.println(lista.size());

        for (String s : lista) {
            System.out.println(s);
        }
    }
}