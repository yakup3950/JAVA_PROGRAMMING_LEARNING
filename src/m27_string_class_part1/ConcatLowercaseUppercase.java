package m27_string_class_part1;

public class ConcatLowercaseUppercase {
    public static void main(String[] args) {
        String s1 = "Cydeo";

        s1 = s1.concat(" School");

        System.out.println(s1); //Cydeo School

      String lowerCases1 = s1.toLowerCase();
        System.out.println(lowerCases1);

        String upperCases1 = s1.toUpperCase();
        System.out.println(upperCases1);
    }

}
