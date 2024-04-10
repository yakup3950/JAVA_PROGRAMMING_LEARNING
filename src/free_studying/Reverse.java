package free_studying;

public class Reverse {

    public static void main(String[] args) {

        String str = "I like coding";

        //System.out.println(reverse(str));

        reverse(str);
    }

    public static void reverse(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {

            char str1 = str.charAt(i);

            System.out.print(str1);

        }
    }
}
