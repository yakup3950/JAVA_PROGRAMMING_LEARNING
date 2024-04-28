package free_studying;

import java.util.Arrays;

/*
CamelCase [loop, String, method]

    create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is uppercase and the rest of the word is in lowercase

    Exception: The first word starts with a lowercase

    Ex:
        Input:
            JAVA will ruLE tHe wORLd
        Output:
            javaWillRuleTheWorld
 */
public class CamelCase {

    public static void main(String[] args) {

        String str = "JAVA will ruLE tHe wORLd.";

        // System.out.println(Arrays.toString(toCamelCase(str)));
        //String[] a = toCamelCase(str);
        System.out.println(toCamelCase(str));
    }

    // JAVA will ruLE tHe wORLd
    //   0    1    2   3    4
    public static String toCamelCase(String str) {

        String[] s = str.toLowerCase().replace(".", "").split(" ");
        String[] result = new String[s.length];
        String resultLast = "";
        int i;
        for (i = 0; i < s.length; i++) {

            if (i == 0) {
                result[i] = s[i].substring(0);
            } else {
                result[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            }
            resultLast += result[i];
        }

        return resultLast;
    }
}
