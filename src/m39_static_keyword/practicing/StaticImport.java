package m39_static_keyword.practicing;

import static java.lang.Math.*;

/*
   Write a program that calculates the maximum of two numbers and the area of a circle using the related
   functions and fields from the java.lang.Math class. You should make a static import of the Math class
   to increase readability.
            Example:
            Input:
            n1 = 5
            n2 = 10
            radius = 4.5
            maxNumber =10
            area = 63.61725123519331
 */
public class StaticImport {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        double radius = 4.5;

        maxNumber(num1, num2);
        areaCircle(radius);
    }


    public static void maxNumber(int num1, int num2) {

        System.out.println("MaxNumber : " + max(num1, num2));
    }

    public static void areaCircle(double radius) {

        double rds = pow(radius, 2);
        double area = round(Math.PI * rds);
        System.out.println("Area : " + area);
    }
}
