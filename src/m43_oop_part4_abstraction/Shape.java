package m43_oop_part4_abstraction;

public abstract class Shape {

    public final String name = getClass().getSimpleName();

    public abstract double calculateArea();

    @Override
    public String toString() {
        return name + "{" +
                "name='" + calculateArea() + '\'' +
                '}';
    }
}
