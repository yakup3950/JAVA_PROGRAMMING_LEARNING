package m43_oop_part4_abstraction;

public interface InterfaceMethods {

    int VAR = 100;//defaultly public static final.

    //THESE ARE THE METHODS THAT ALLOWED IN AN INTERFACE.

    void abstractMethod();

    static void staticMethod(int VAR) {
        System.out.println(VAR);
    }

    default void defaultMethod() {
        System.out.println("Default method");
    }// default method is in interface only.

    private static void privateMethod() {
        System.out.println("Private method");
    }//it can be used within this interface. it can NOT be used anywhere else.
}
