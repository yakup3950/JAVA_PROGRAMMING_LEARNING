package m42_access_modifiers_final_object_class.package2;

import m42_access_modifiers_final_object_class.package1.ClassA;

public class ClassD extends ClassA {

    public static void main(String[] args) {

        System.out.println(ClassA.a); //public
        System.out.println(ClassA.b); //protected
//        System.out.println(ClassA.c);
//        System.out.println(ClassA.d);

    }

}
