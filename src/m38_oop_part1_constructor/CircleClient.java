package m38_oop_part1_constructor;

import m39_static_keyword.Circle;

public class CircleClient {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(Circle.PI);
        System.out.println(circle1.PI);
        System.out.println(circle1.PI);


        circle1.PI = 5.4;
        System.out.println(circle1.PI);
        System.out.println(circle2.PI);

    }
}
