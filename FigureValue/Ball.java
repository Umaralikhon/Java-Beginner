package Platform;

public class Ball {
    private double r;
    private double v;

    public Ball() {
        r = 0;
        v = 0;
    }

    public Ball(double r) {
        this.r = r;
    }

    public double countValOfBall() {
        v = 1.0 / 3.0 * 3.14 * Math.pow(r, 2.0);
        return v;
    }

    public void printBallInfo() {
        System.out.println("R: " + r);
        System.out.println("V: " + countValOfBall());
    }
}
