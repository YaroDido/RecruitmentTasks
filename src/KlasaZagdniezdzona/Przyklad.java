package KlasaZagdniezdzona;

public class Przyklad {
    public static void main(String[] args) {

        KontoBankowe kontobankowe = new KontoBankowe(1000);

        System.out.println(kontobankowe.getStanKonta());

        kontobankowe.start(5);

        System.out.println(kontobankowe.getStanKonta());
    }
}

class KontoBankowe {
    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    private double stanKonta;

    double getStanKonta() {
        return  this.stanKonta;
    }

    void start(double stopa) {
        Odsetki odsetki = new Odsetki(stopa);
        odsetki.zmienStanKonta(stopa);
    }


    class Odsetki {
        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }

        void zmienStanKonta(double stopa){
            double Odsetki = (stanKonta * stopa) /100;
            stanKonta += Odsetki;
        }

        private double stopaProcentowa;
    }
}
