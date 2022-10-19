package CodeGym;

public class Solution2 {
    public static void main(String[] args) {
        Mezczyzna mezczyzna1 = new Mezczyzna("Mike", 23, "Luna");
        Mezczyzna mezczyzna2 = new Mezczyzna("Sophia", 15, "Earth");
        Kobieta kobieta1 = new Kobieta("Diana", 35, "Mars");
        Kobieta kobieta2 = new Kobieta("John", 23, "Luna");
        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);
        System.out.println(kobieta1);
        System.out.println(kobieta2);
    }

    public static class Mezczyzna {
        String imie;
        int wiek;
        String adres;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
        public String toString() {
            return(imie + " " + wiek + " " + adres);
        }
    }

    public static class Kobieta {
        String imie;
        int wiek;
        String adres;

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
        public String toString() {
            return(imie + " " + wiek + " " + adres);
        }
    }
}

