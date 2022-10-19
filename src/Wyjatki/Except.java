package Wyjatki;

public class Except {
    public static void main(String[] args) {

        try {
            System.out.println(5/1);
        } catch(ArithmeticException ex) {
            System.out.println("Powstał wyjatek: " + ex.getMessage());
        }
        finally {
            System.out.println("Coś co zawsze zostanie wywołane");
        }
        System.out.println("Byle co");

    }

    /*
    try {
    //instrukcja ktora potencjalnie moga sprowadzac błąd

    } catch (NazwaZwracanegoWyjatku nazwazniennej) {

    //instrukcja obsługujące złapany wyjątek
    }
     */

}
