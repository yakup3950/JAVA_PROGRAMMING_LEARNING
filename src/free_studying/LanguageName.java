package free_studying;
/*
LanguageCharacters [array, char, loop, method]

    Create a method that will accept a String for the language name. Based on the given language name return a char array of the characters that are used in that language. We will use ascii numbers

    Use the following ranges:

    English: 33 - 126

    Greek: 884 - 1011

    Arabic: 1548 - 1790

    Chinese, Japanese, Korean: 63744 - 64045
        (this group of characters are the: CJK Compatibility Ideographs)

    Braille: 10240 - 10495
 */

import java.util.Scanner;

public class LanguageName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter language name: ");
        String lang = sc.nextLine();

        System.out.println(languageName(lang));

    }

    public static char[] languageName(String name) {

        //char[] ascii = new char[];

        switch (name) {

            case "English":

                char[] english = new char[91];
                int counterE = 0;
                for (char i = 33; i <= 123; i++) {
                    english[counterE] = i;
                        counterE++;
                }
                return english;

            case "Greek":
                char[] greek = new char[1012];
                int counterG = 0;
                for (char j = 884; j <= 1011; j++) {
                    greek[j] = j;
                    counterG++;
                }
                return greek;

            case "Arabic":
                char[] arabic = new char[1791];
                int counterA = 0;
                for (char k = 1548; k <= 1790; k++) {
                    arabic[k] = k;
                    counterA++;
                }
                return arabic;

            case "Chinese":
                char[] chinese = new char[64046];
                int counterC = 0;
                for (char n = 63744; n <= 64045; n++) {
                    chinese[n] = n;
                    counterC++;
                }
                return chinese;
        }
        return null;
    }
}
