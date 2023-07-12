package paint;

public class Quadrate extends Rectangle{
    public Quadrate(double x, double y) {
        super(x, y);
    }
    @Override
    public void draw(){
        System.out.printf("Нарисован чёрный квадрат с координатами %f %f", point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован " + color + " квадрат с координатами " + point.getX() + " " + point.getY());
    }
}
