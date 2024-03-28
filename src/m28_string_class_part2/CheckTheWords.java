package m28_string_class_part2;

import java.util.Scanner;

public class CheckTheWords {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the keyword :");
//        String keyword = scan.next();
//
//        String text = "I like to read yakup novel. But nowadays I dont have much time to read,";
//
//        System.out.println(checkTheWords(keyword, text));

        String str = " ";

        System.out.println("Empty : " + str.isEmpty());
        System.out.println("Blank : " + str.isBlank());
    }

    public static boolean checkTheWords(String keyword, String text) {

        keyword = keyword.toLowerCase();
        text = text.toLowerCase();

        return text.contains(keyword);

    }
}
