package m41_oop_part3_inheritance.method_overriding;

public class Driver extends Employee {


    public Driver(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void work() {

        System.out.println("Driver " + name + " is teaching.");
    }
}
