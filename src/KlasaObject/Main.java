package KlasaObject;

public class Main {
    public static void main(String[] args) {
        Object a = new Punkt(4, 50);
        Punkt p = new Punkt(4, 10);
        Punkt p2 = new Punkt(4, 10);

        if (p.equals(p2))
            System.out.println("są sobie równe");
    }
}

class Punkt {
    private int x;
    private int y;

    Punkt() {

    }

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null)
            return false;
        if (this == o)
            return true;
        Punkt przyslany = (Punkt)o;


        return this.x == przyslany.x && this.y == przyslany.y;
    }
}
