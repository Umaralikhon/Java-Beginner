package Platform;

public class Paral {
    private double a;
    private double b;
    private double c;
    private double v;

    public Paral() {
        a = 0;
        b = 0;
        c = 0;
        v = 0;
    }

    public Paral(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double countValOfParal() {
        v = a * b * c;
        return v;
    }

    void printParalInfo() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("V: " + countValOfParal());
    }
}
