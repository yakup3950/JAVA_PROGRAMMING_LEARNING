package m41_oop_part3_inheritance.super_keyword;

public class Student extends Person {

    public String schoolName;
    public String studentId;

    public Student() {
        super("Unknown", 16, "Male");
    }

    public Student(String name, int age, String gender, String schoolName, String studentId) {
        super(name, age, gender);
        //this(); ONLY ONE EXPLICIT CONSTRUCTOR CAN BE CALLED AT A TIME IN A CONSTRUCTOR.
        this.schoolName = schoolName;
        this.studentId = studentId;
//keep in mind! if you don't want call vars and methods of super class, you should not use the super key word.
        System.out.println(this.age);
        System.out.println(super.age);
        System.out.println(this.age);
        System.out.println(super.gender);

        super.eat();

    }


//        this.name = name;
//        this.age = age;
//        this.gender = gender;

    // BOTH CAN BE USEFUL TO CALL THE EAT METHOD FROM THE SUPER CLASS.
    //this.eat();
    //super.eat();

    //System.out.println(super.age);
    //System.out.println(super.isHuman); // EVEN IF IT IS STATIC IT CAN BE CALLED  BY SUPER. BUT NOT RECOMMENDED. IT SHOULD BE CALLED BY CLASS NAME.


}

