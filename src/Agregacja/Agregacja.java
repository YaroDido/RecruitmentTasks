package Agregacja;

/**
 *
 * @author
 * */


public class Agregacja {
    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Arek", new Adres("DupaRomana", 92));
        Pracownik p2 = new Pracownik("Arek", new Adres("DupaRomana", 92));
        Pracownik p3 = new Pracownik("Arek", new Adres("DupaRomana", 92));
        Pracownik p4 = new Pracownik("Arek", new Adres("DupaRomana", 92));

        System.out.println(p1 );

    }
}

    class Pracownik {
        String imie;
        Adres adres;

        public Pracownik(String imie, Adres adres) {
            this.imie = imie;
            this.adres= adres;
        }

        @Override
        public String toString() {
            return this.imie + ": " + adres.ulica + " " + adres.nrDomu;
        }
    }

    class Adres{
        String ulica;
        int nrDomu;

        public Adres(String ulica, int nrDomu) {
            this.ulica = ulica;
            this.nrDomu = nrDomu;
        }
    }
