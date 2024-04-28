package free_studying.week6;
/*
3. Frequency of Characters Task:
    Write a program to display the frequency of each character in a given string.
        Example:
            str = "aabbbcccc"
        Output:
             a2b3c4
 */

public class frequencyOfCharacters {

    public static void main(String[] args) {

        frequency("aabbbccccc");
    }
    //   1 2 3 4 5 6 7 8 9 10
    //   a a b b b c c c c c
    //   0 1 2 3 4 5 6 7 8 9

    public static void frequency(String str) {

        char[] ch = str.toCharArray();

        System.out.println(ch);

        for (int i = 0; i < ch.length; i++) {

            int count = 0;

            for (int j = 0; j <= ch.length - 1; j++) {

                if (str.charAt(i) == ch[j]) {

                    count++;

                }

            }

            System.out.print(str.charAt(i) + "" + count + " ");

        }
    }
}

