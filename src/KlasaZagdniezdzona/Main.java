package KlasaZagdniezdzona;

public class Main {

    public static void main(String[] args) {

        A zewnetrzne = new A();

         A.B tmp = zewnetrzne.new B();

         A.C tmp2 = new A.C();


    }
}

class A {
    A(){
        System.out.println("Jestem z klasy zewnętrzenj A");
    }
    class B {
        B(){
            System.out.println("Jestem z klasy zagnieżdżonej B");
        }

        void cos() {
            test = 5;
        }

        private int tmp;
    }

    static class C {
        C() {
            System.out.println("Jestem z klasy zagnieżdżonej C");
        }
    }

    void cos2() {
        //tmp = 2;
        B obj = new B();
    }
    private int test;
}

