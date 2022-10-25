package CodeGym3;

public class Solution3 {
    public static void main(String[] args) {
        Ludzie ludz1 = new Ludzie("Dupa1", true, 33);
        Ludzie ludz2 = new Ludzie("Dupa2", true, 35);
        Ludzie ludz3 = new Ludzie("Dupa3", true, 37);
        Ludzie ludz4 = new Ludzie("Dupa4", true, 30);

        Ludzie ludz11 = new Ludzie("Zopsel", false, 35, ludz1, ludz2);
        Ludzie ludz12 = new Ludzie("Zopsel", false, 35, ludz2, ludz1);
        Ludzie ludz13 = new Ludzie("Zopsel", false, 35, ludz4, ludz1);
        Ludzie ludz14 = new Ludzie("Zopsel", false, 35, ludz3, ludz4);
        Ludzie ludz15 = new Ludzie("Zopsel", false, 35, ludz4, ludz2);

        System.out.println(ludz1);
        System.out.println(ludz2);
        System.out.println(ludz3);
        System.out.println(ludz4);
        System.out.println(ludz11);
        System.out.println(ludz12);
        System.out.println(ludz13);
        System.out.println(ludz14);
        System.out.println(ludz15);
    }

    public static class Ludzie {
       String imie;
       boolean plec;
       int wiek;
       Ludzie ojciec;
       Ludzie matka;

       public Ludzie(String imie, boolean plec, int wiek) {
           this.imie = imie;
           this.plec = plec;
           this.wiek = wiek;
       }

       public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka) {
           this.imie = imie;
           this.plec = plec;
           this.wiek = wiek;
           this.ojciec = ojciec;
           this.matka = matka;
       }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }
    }
}
