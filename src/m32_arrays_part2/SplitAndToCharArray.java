package m32_arrays_part2;

import java.util.Arrays;

public class SplitAndToCharArray {

    public static void main(String[] args) {

        String str = "Apple Banana Cherry Orange Strawberry yakup Huriye Duygu Arzu";

                       String[] fruits = str.split(" ");

        System.out.println(Arrays.toString(fruits));

        System.out.println("-------------------------------------");

        String str2 = "hello world";

                    char[] letters = str2.replace(",","").replace(" ","").replace(". ","").toCharArray();

        System.out.println(Arrays.toString(letters));
    }
}
