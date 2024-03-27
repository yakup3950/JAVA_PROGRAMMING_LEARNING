package m26_user_input_modul;

import java.util.Scanner;

public class ScannerCharString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character :");
        char character = scan.next().charAt(0);
        System.out.print("Would you like to continue?");
        String yesOrNo = scan.next();

        scan.close();

        System.out.println("character : " + character);
        System.out.println("YesmiNomu : " + yesOrNo);

    }

}
