package m27_string_class_part1;

public class EqualsVsEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
}
