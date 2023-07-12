package paint;

public class Point {
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
