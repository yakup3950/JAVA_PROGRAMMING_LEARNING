package m27_string_class_part1;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = scan.next();
        System.out.print("Enter your last name : ");
        String lastName = scan.next();
            scan.close();

        System.out.println("Total characters in your first and last name is : " + totalChar(firstName,lastName));
    }

    public static int totalChar(String firstname, String lastName){

        String total = firstname.concat(lastName);
        return total.length();
    }
}
