package m35_java_lang_classes;

import java.util.Arrays;

public class AutoboxingUnboxingClasses {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int numCount = 0;
        for (int i = 0; i < numbers.length; i++) {

            numCount += 10;
            numbers[i] = numCount;
            Integer numberInteger = Integer.valueOf(numbers[i]); //Autoboxing
            System.out.print(" " + numberInteger);

        }
        System.out.println("-----------------------------------");
    }
}
