package Platform;

public class Cone {
    private double r;
    private double h;
    private double v;

    public Cone() {
        r = 0;
        h = 0;
        v = 0;
    }

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double countValOfCone() {
        v = (1.0 / 3.0) * 3.14 * Math.pow(r, 2.0) * h;
        return v;
    }

    public void printConeInfo() {
        System.out.println("R: " + r);
        System.out.println("H: " + h);
        System.out.println("V: " + countValOfCone());
    }
}
