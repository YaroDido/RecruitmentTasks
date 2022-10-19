package CodeGym;

public class Solution9 {
    public static void main(String[] args) {
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        Kot kot4 = new Kot();
        Kot kot5 = new Kot();
        Kot kot6 = new Kot();
        Kot kot7 = new Kot();
        Kot kot8 = new Kot();
        Kot kot9 = new Kot();
        Kot kot0 = new Kot();

        System.out.println(Kot.licznikKotow);

        // Wyświetla wartość zmiennej licznikKotow
    }

    public static class Kot {
        public static int licznikKotow = 0;

        public Kot() {
            licznikKotow++;
        }


    }
}
