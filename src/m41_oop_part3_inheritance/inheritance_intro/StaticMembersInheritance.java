package m41_oop_part3_inheritance.inheritance_intro;


class ClassA {
    public static int a = 100;

    public static void method() {

        System.out.println("Parent class' static method");

    }

}

class ClassB extends ClassA {

    public static void method() {

        System.out.println("1");

    }

}


public class StaticMembersInheritance {
    public static void main(String[] args) {
        System.out.println(ClassA.a);
        System.out.println(ClassB.a);

        ClassA.method();
        ClassB.method();
    }
}
