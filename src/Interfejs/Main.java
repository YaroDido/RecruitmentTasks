package Interfejs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println(nazwaInterface.PI);

        int[] tab = new int[3];
        tab [0] = 3;
        tab [1] = -15;
        tab[2] = 13;

        Arrays.sort(tab);

        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(100000);
        pracownik[1] = new Pracownik(203400);
        pracownik[2] = new Pracownik(300607);

        System.out.println(pracownik[0].compareTo(pracownik[1]));

        Arrays.sort(pracownik, Collections.reverseOrder());

        for (Pracownik p: pracownik) {
            System.out.println(p.getWynagrodzenie());
        }

    }
}

interface nazwaInterface {
    double PI = 3.14d;

    void metoda();

    interface cosik {

    }

}

class Pracownik implements nazwaInterface, nazwaInterface.cosik, Comparable {

    @Override
    public void metoda() {
        throw new UnsupportedOperationException("Not support yet");

    }
    Pracownik(double wynagrodzenie) {

        this.wynagrodzenie = wynagrodzenie;
    }
    public double getWynagrodzenie(){

        return this.wynagrodzenie;
    }
    private double wynagrodzenie;

    @Override
    public int compareTo(Object t)
    {

        Pracownik przyslany = (Pracownik)t;

       if (this.wynagrodzenie < przyslany.wynagrodzenie)
           return -1;
       else if (this.wynagrodzenie > przyslany.wynagrodzenie)
           return 1;

       return 0;

       }
    }

    class Programista extends Pracownik {

        Programista(double wynagrodzenie) {

            super(wynagrodzenie);
        }
    }
