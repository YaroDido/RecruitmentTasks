package CodeGym;

public class Pies {
    public String imie;
    public int wzrost;
    public String kolor;

    public void inicjalizuj(String imie) {
        this.imie = imie;
    }

    public void inicjalizuj(String imie, int wzrost) {
        this.imie = imie;
        this.wzrost = wzrost;
    }

    public void inicjalizuj(String imie, int wzrost, String kolor) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor = kolor;
    }
}

