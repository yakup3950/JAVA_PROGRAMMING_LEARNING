package m27_string_class_part1;

public class EqualsMethodVsEqualsOperator {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";


        System.out.println(s1 == s2); //same object
        System.out.println(s1.equals(s2)); //having the same characters in the same order.

        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3 == s4); //false
        System.out.println(s3.equals(s4)); //true
        System.out.println(s1.equals(s3)); //true

        String s5 = "java";

        System.out.println(s1.equals(s5)); //false
    }
}
