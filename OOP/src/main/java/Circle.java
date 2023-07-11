public class Circle {
    double radius;
    int color;
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(){
        return 2 * radius * Math.PI;
    }

    Circle(double Radius, int Color){
        radius = Radius;
        color = Color;
    }

    public void tostring(){
        System.out.printf("Радиус: %f, цвет: %d", radius, color);
    }
}
