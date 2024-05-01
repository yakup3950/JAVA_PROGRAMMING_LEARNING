package m43_oop_part4_abstraction;

public class ShapeClients {
    public static void main(String[] args) {
        //Shape shape = new Shape();//Since it is a concrete class it can NOT be instanciated.

        Circle circle = new Circle(5);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle(7, 8);

        System.out.println(rectangle);
    }
}
