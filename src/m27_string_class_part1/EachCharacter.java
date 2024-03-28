package m27_string_class_part1;

import java.util.Scanner;

public class EachCharacter {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Input : ");
//        String input = scan.nextLine();

        eachCharacter("yakup");
    }

    public static void eachCharacter(String input) {

        if (input == "" || input.length() == 0 || input == "null") {
            System.err.println("The text can not be null or empty");
        } else {
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
            }
        }
    }
}