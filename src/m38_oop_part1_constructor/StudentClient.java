package m38_oop_part1_constructor;

public class StudentClient {

    public static void main(String[] args) {

        Student student1 = new Student("yakup", 22); //parameterized

//        student1.name = "yakup";
//        student1.age = 22;

        System.out.println(student1.name);
        System.out.println(student1.age);


        Student student2 = new Student(); //default

        System.out.println("Std1 : " + student1);
        System.out.println("Std2 : " + student2);


        Student student3 = new Student("Huriye"); //single argument
        System.out.println("Std3 : " + student3);

        Student student4 = new Student("ali", 52, "male", 78);
        System.out.println("Std4 : " + student4);

    }
}
