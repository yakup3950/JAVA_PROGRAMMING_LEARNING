package m44_oop_part5_polymorphism;

import m43_oop_part4_abstraction.Circle;
import m43_oop_part4_abstraction.Shape;

import java.util.ArrayList;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4); //Upcasting occurs implicitly. So Casting here is redundant.

        Shape shape = new Circle(5);

        System.out.println(shape.name);
        System.out.println(shape.calculateArea());
        //System.out.println(shape.radius);

        Circle circle = (Circle) shape;
        //System.out.println(circle.radius);
        //System.out.println((Circle)shape).radius);

        Shape shape1 = new Circle(5);
        Shape shape2 = new Circle(5);

        System.out.println(shape1 == shape2);
        System.out.println(shape1.equals(shape2));

        Shape shape3 = new Circle(20);

        System.out.println(shape3.equals(shape1));

    }
}
