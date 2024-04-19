package m40_oop_part2_encapsulation;

public class Person {

    private String name;
    public int age;

    public String getName() {
        if (name == null) {
            System.err.println("The name may not be null");
            System.exit(1); //terminates the entire program.
        }
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid input/data for the name:" + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid input/data for the age. It may not be negative:" + age);
            System.exit(1);//when yu0
        }
        this.age = age;
    }
}



