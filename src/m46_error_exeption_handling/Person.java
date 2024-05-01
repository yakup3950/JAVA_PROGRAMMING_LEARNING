package m46_error_exeption_handling;

public class Person {

    private String name;
    private int age;
    String YELLOW = "\u001B[33m";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException(YELLOW + "Name of the person can not be empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new RuntimeException(YELLOW + "Age of the person can not be zero or negative");
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
