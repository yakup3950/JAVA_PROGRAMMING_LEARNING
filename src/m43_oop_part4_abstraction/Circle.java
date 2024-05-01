package m43_oop_part4_abstraction;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "  " +
                "area=" + calculateArea() +
                '}';
    }

    // TO COMPARE THE OBJECTS BASED ON THE OVERRIDE OBJECT AT THE REFERENCE-TYPE-CASTING-CLASS.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            ((Circle) obj).radius = this.radius;
            return true;
        }
        return false;
    }
}
