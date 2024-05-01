package m44_oop_part5_polymorphism;

import m43_oop_part4_abstraction.*;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Shape circle = new Circle(3.5);
        System.out.println(circle);
        Shape rectangle = new Rectangle(4, 5);
        System.out.println(rectangle);

        Volume obj = new Cube(9);
        System.out.println(obj);

        //Volume obj2 = new Circle(4); does not have a is-A relation

        Shape cube = new Cube(9);
        System.out.println(cube);

        displayAreaOfShape(circle);
        displayAreaOfShape(rectangle);
        displayAreaOfShape(cube);
        System.out.println("-----------------------------------------------");

        Shape[] shape = {new Circle(10), new Rectangle(20, 30), new Cube(40)};

        Shape[] shapes = {circle, rectangle, cube};
        System.out.println(Arrays.toString(shapes));

        for (Shape each : shape) {
            System.out.println("EACH : " + each);
            displayAreaOfShape(each);
        }
    }

    public static void displayAreaOfShape(Shape shape) {
        System.out.println("The name of " + shape.name + " is " + shape.calculateArea());

    }
}
