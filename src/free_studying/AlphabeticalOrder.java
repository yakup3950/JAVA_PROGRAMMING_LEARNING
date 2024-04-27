package free_studying;

/*
2. SortedOrder
    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetical order
        return false if the given String is not sorted

        Example:
            input: "abcd"
            output: true

            input: "abzy"
            output: false

 */
public class AlphabeticalOrder {

    public static void main(String[] args) {
        System.out.println(alphabeticalOrder("cegzi"));
    }

    public static boolean alphabeticalOrder(String str) {

        char[] ch = str.toCharArray();
        for (char i = 97; i <= 122; i++) {
            for (int j = 0; j < str.length(); j++) {

                if (ch[j] == i) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
