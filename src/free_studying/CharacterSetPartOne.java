package free_studying;
/*
3a. CharacterSet part 1 [methods, loops]

	Create a method that will accept two chars and return a String.
	Based on the given chars, output a character sequence where the first char is the starting character and the second char is the ending character for the sequence

	Note: the character sequence will go in order, so the starting char should come before the ending char. Use the ascii table is a reference

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}

3b. CharacterSet part 2 [methods, loops, overloading]

    Create a method (overloading the method from part 1) that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.

    so if the method is called with the argument "digit" then the
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class CharacterSetPartOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type character sequence :");
        String str = sc.next();
        System.out.println(" -->");


        //STRING
        String mainStr = sequenceOfCharacters('X', '}');
        System.out.println();

        //CHAR
        String ascii = sequenceOfCharacters(str);
        System.out.println(str + " --> " + ascii);


        System.out.println("The char set is --> " + mainStr);
    }

    public static String sequenceOfCharacters(char ch1, char ch2) {

        String str = "";

        for (char i = ch1; i <= ch2; i++) {
            str += i;
        }
        return str;
    }

    public static String sequenceOfCharacters(String str) {

        switch (str) {

            case "uppercase":

                for (char i = 65; i <= 90; i++) {
                    str += i;
                }
                return "                    " + str;

            case "lowercase":

                for (char i = 97; i <= 122; i++) {
                    str += i;
                }
                return str;

            case "digit":

                for (char i = 48; i <= 57; i++) {
                    str += i;
                }
                return str;

            case "special":

                for (char i = 33; i <= 47; i++) {
                    str += i;
                }
                return str;

        }
        return null;
    }

    //TODO I am gonna return for the adjacent string expressions on the results.
}
