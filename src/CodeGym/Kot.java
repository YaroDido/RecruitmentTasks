package CodeGym;

    public class Kot {

        public int wiek;
        public int waga;
        public int sila;

        public Kot() {
        }

        public boolean walka(Kot innyKot) {
           int wiekPrzewaga = this.wiek > innyKot.wiek ? 1 : 0;
           int wagaPrzewaga = this.waga > innyKot.waga ? 1 : 0;
           int silaPrzewaga = this.sila > innyKot.sila ? 1 : 0;

           int wynik = wiekPrzewaga + wagaPrzewaga + silaPrzewaga;
           return wynik > 2;
        }

        public static void main(String[] args) {

        }
    }
