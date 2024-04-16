package m39_static_keyword;

public class MyClass {

    public static int staticVar;
    public int instanceVar;

    public static void main(String[] args) {
        System.out.println(staticVar);
        staticMethod();
        //System.out.println(instanceVar);
        //instanceMethod();
    }

    public void instanceMethod() {

        System.out.println(staticVar);
        System.out.println(instanceVar);

    }

    public static void staticMethod() {

    }
}
