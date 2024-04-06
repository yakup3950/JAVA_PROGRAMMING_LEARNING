package m35_java_lang_classes;

import java.util.Collections;

public class MathClass {

    public static void main(String[] args) {
        int a = Math.max(5, 12);
        System.out.println(a);

        int b = Math.min(5, 12);
        System.out.println(b);

        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(100));

        System.out.println(Math.pow(10, 2)); //double result
        int power = (int) Math.pow(10, 2);
        System.out.println(power);

        System.out.println(Math.sqrt(25));

        System.out.println("Random : " + Math.random());


        System.out.println("Round :" + Math.round(10.7));
        System.out.println("Round :" + Math.round(10.5));
        System.out.println("Round :" + Math.round(10.4));

        System.out.println("Floor : " + Math.floor(20.9));
        System.out.println("Ceiling :" + Math.ceil(20.1));

        System.out.println("PI : " + Math.PI);

    }

}
