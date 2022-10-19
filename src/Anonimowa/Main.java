package Anonimowa;

public class Main {
    public static void main(String[] args) {

        //@param Lambda
        ZachowaniePoWciśnienciu z = () -> {
           System.out.println("Jestem z klasy anonimowej");

        };

        ZachowaniePoWciśnieńciu2 z2 = (int a, int b) -> {
            System.out.println( a + b);
        };

        Przycisk1 p = new Przycisk1();
        p.dodajAkcje(() -> {
            System.out.println("Ostatni z klasy anonimowej!");
        });

        p.dodajAkcje2(5, 10, z2);

    }

    interface ZachowaniePoWciśnienciu {
        void akcja();
    }

    interface ZachowaniePoWciśnieńciu2 {
        void akcja2(int a, int b);
    }

   static class Przycisk1 {

       void dodajAkcje(ZachowaniePoWciśnienciu z) {

           z.akcja();
       }


       void dodajAkcje2(int a, int b, ZachowaniePoWciśnieńciu2 z) {
           z.akcja2(a, b);
       }
   }

}

/*Lambda Wyrażenie
() - > {}
 () - tu podajemy argumentu do przewsłania do funkcji
 -> szybka informacja że mamy do czynienie z wyrażeniem lambda
 {} - Treść wyrażenia

 */

