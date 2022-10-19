package MetodyDomysle;

public class Main {
    public static void main(String[] args) {

        Formula f = (int a) -> {
            return 5;
        };
        System.out.println(f);

    }
}

interface Formula {
    double calculate(int a); //jedna na interfejs jeżeli uzywamy lambdy

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

class A implements Formula {

    @Override
    public double calculate(int a) {
        return this.sqrt(a * 5);
    }
}
