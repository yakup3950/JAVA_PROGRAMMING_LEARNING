package free_studying;
/*
1. Create a class named DivideTwoNumbers and write a program that can perform division of two numbers without using the division (/) and multiplication (*) operators.

		Example:
			n1 = 100
			n2 = 6
		Output:
			16 with a reminder of 4
*/

import m35_java_lang_classes.MathClass;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1 = 120;
        int num2 = 6;
        int count = 0;

        for (int i = num2; i <= num1; i += 6) {
            count++;
        }
        int remainder = num1 % num2;

        System.out.println(count + " with a reminder of " + remainder);

    }
}
