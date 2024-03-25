package m25_class_and_object;

import java.sql.SQLOutput;

public class Car {

    String make;
    String model;
    int year;
    String color;
    double price;

    int currentSpeed ;
    int speedLimit ;

    public void start(String make, String model){
        System.out.println(make + " " + model + " is starting.");
    }
    public void drive(String make, String model){
        System.out.println(make + " " + model + " is driving.");
    }
    public void stop(String make, String model){
        System.out.println(make + " " + model + " is stopping.");
    }

    public void showCurrentSpeed(int currentSpeed,int speedLimit){

        if (currentSpeed < speedLimit){
            System.out.println(make + " is driving at " + currentSpeed + " following the speed limit is " + speedLimit);
        }else if(currentSpeed>speedLimit){
            System.out.println(make + " is driving at " + currentSpeed + " over the speed limit " + speedLimit);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", currentSpeed=" + currentSpeed +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
