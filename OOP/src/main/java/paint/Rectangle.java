package paint;

public class Rectangle extends Figure{
    public Rectangle(double x, double y) {
        point = new Point(x, y);
    }
    @Override
    public void draw(){
        System.out.printf("Нарисован чёрный прямоугольник с координатами %f %f", point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован " + color + " прямоугольник с координатами " + point.getX() + " " + point.getY());
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
