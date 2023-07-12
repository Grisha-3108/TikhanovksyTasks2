package paint;

public class Triagle extends Figure{
    public Triagle(double x, double y) {
        point = new Point(x, y);
    }
    @Override
    public void draw(){
        System.out.printf("Нарисован чёрный треугольник с координатами %f %f", point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован " + color + " треугольник с координатами " + point.getX() + " " + point.getY());
    }
    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}

