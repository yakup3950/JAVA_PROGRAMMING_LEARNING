package m43_oop_part4_abstraction;

public class Cube extends Shape implements Volume {

    public double side;

    public Cube(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    public double volume() {
        return Math.pow(side, 3);
    }


}
