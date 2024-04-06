package m35_java_lang_classes;

public class WrapperClassMethods {

    public static void main(String[] args) {

        char ch = '$';

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit : " + isDigit);

        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter : " + isLetter);

        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println("isLetterOrDigit : " + isLetterOrDigit);

        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println("isUpperCase : " + isUpperCase);

        boolean isLowerCase = Character.isLowerCase(ch);
        System.out.println("isLowerCase : " + isLowerCase);

        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch); //GIVES SPECIAL CHARACTER
        System.out.println("isSpecialCharacter : " + isSpecialCharacter);

        System.out.println("----------------------------------------");

        String str = "a1b2c3d4+*%&/()";

        for (char each : str.toCharArray()) {

            //System.out.print(each + " ");
            if (Character.isDigit(each)) {
                System.out.print(each + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        int a = Integer.MIN_VALUE;
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

    }
}
