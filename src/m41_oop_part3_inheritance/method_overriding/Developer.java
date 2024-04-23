package m41_oop_part3_inheritance.method_overriding;

public class Developer extends Employee {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer " + name + " is coding.");
    }
}
