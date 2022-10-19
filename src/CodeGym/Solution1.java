package CodeGym;

public class Solution1 {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.inicjalizuj("Yarek", 23);

        System.out.println(osoba);
    }

    static class Osoba {
        String imie;
        int wiek;

        public void inicjalizuj(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }
    }

}
