package free_studying.week6;
/*
1. String Reverse & Palindrome Task:

	1.1 Create a method to reverse a given string and provide the reversed result.
			Example:
			 	reverse("Cydeo");
			Output:
			 	"oedyC"

	1.2 Create a method named isPalindrome to check if a given string is a palindrome.
	    A string is palindrome if the characters are the same being read from the beginning or the end
			Example:
			 	isPalindrome("Level");
			Output:
			 	true
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseAndPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.next();

        System.out.println("REVERSE : " + reverse(input));
        System.out.println("====================================");
        isPalindrome(input);
    }
    // 1 2 3 4 5 (LENGTH)
    // Y A K U P
    // 0 1 2 3 4 (INDEX)

    public static String reverse(String str) {
        String ch1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            ch1 += ch;
        }
        return ch1;
    }
    // 1 2 3 4 5
    // L E V E L
    // 0 1 2 3 4

    public static void isPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {

                //System.out.println("DEBUG : " + (i) + str.charAt(i) + " is a palindrome");

            } else {

                System.err.println("This NOT a palindrome.");
                break;
            }

        }
        System.out.println("This is palindrome");
    }

}
