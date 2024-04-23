package m41_oop_part3_inheritance.method_overriding;

public class Teacher extends Employee {

    public Teacher(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void work() {

        System.out.println("Teacher " + name + " is teaching.");
    }
}
