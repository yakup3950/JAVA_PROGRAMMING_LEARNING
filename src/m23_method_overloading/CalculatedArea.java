package m23_method_overloading;

public class CalculatedArea {
    final static double PI = 3.14;
    public static void main(String[] args) {

        calculateArea(5);

        double recArea = calculateArea(4,6);
        System.out.println("Rectangle Area: " + recArea);
    }

    public static void calculateArea(double num){
        double radius = PI * num * num;
        System.out.println("Radius = " + radius);
    }

    public static double calculateArea(double num1, double num2){
        double area = num1 * num2;
        return area;
    }
}
