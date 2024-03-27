package m26_user_input_modul;

import java.util.Scanner;

public class ScannerDecimals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number :");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number :");
        double num2 = scan.nextDouble();
        System.out.print("Enter a boolean expression :");
        boolean trueOrNot = scan.nextBoolean();
        scan.close();

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("r : " + trueOrNot);

    }
}
