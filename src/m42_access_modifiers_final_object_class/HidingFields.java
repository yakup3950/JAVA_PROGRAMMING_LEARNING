package m42_access_modifiers_final_object_class;


class Parent {
    public static int a = 100;
    public int b = 100;

    public static void staticMethod() {
        System.out.println("Parent class' static Method");
    }
}

class Child extends Parent {

    public static int a = 250;
    public int b = 2500;

    public static void staticMethod() {
        System.out.println("Child class' static Method");
    }
}

public class HidingFields {
    public static void main(String[] args) {
        Parent.staticMethod();
        Child.staticMethod();

        System.out.println(Parent.a);
        System.out.println(Child.a);

        Parent p = new Child();
        System.out.println(p.b);
        Child c = new Child();
        System.out.println(c.b);

    }
}
