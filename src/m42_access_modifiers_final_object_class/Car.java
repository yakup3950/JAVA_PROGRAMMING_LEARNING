package m42_access_modifiers_final_object_class;

public class Car {

    public String make, model;
    public int year;
    public String color;
    public double price;

    @Override
    public String toString() {

        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
