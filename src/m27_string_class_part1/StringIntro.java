package m27_string_class_part1;

public class StringIntro {
    public static void main(String[] args) {
        String s1 = "wooden spoon"; //String literals
        String s2 = "wooden spoon"; //String literals

        System.out.println(s1 == s2); //true

        String s3 = new String("wooden spoon"); //new object
        String s4 = new String("wooden spoon"); //new object

        System.out.println(s3 == s4); //false
        System.out.println(s1 == s3); //false

    }

}
