package m39_static_keyword;

public class Circle {

    // public static double radius;//only one radius data can be stored anf cab ne used by using class name(only one copy)
    public double radius;//with each object new radius data can be defined(separate copies)
    public static double PI = 3.14; //FINAL do not set the static var in the constructor.Since the constructor helps to creat different copies of instance variables.

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
