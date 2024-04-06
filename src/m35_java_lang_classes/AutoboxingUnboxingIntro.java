package m35_java_lang_classes;

public class AutoboxingUnboxingIntro {

    public static void main(String[] args) {

        //Autoboxing:
        int a = 100;
        Integer num1 = a;

        long b = 200;
        //Integer num2 = b; it is not allowing
        Long num2 = b;

        byte c = 25;
        //Integer num3 = c; it id not allowing
        Byte num3 = c;

        //Unboxing

        Integer d = 100;
        int num4 = d;
        //short num5 = d; it is not allowing.
        long num6 = d;

        Double e = 28.5;
        double num7 = e;
        //float num8 = e; it is not allowing.
    }
}
