package m38_oop_part1_constructor;

public class Student {

    public String name;
    public int age;
    public String gender;
    public double gpa;

    public Student() {
        name = "unknown";
        age = 100;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, String gender) {
        this(name, age);
        this.gender = gender;
    }

    public Student(String name, int age, String gender, double gpa) {
        this(name, age, gender);
        this.gpa = gpa;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    //ALT + INSERT is shortcut for creating INSTRUCTOR
}
