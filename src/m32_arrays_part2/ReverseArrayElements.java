package m32_arrays_part2;

import java.util.Arrays;

public class ReverseArrayElements {

    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] str1 = {"jack", "herry", "willy", "tommy", "sandra", "melany", "rose" };

        //METHOD OVERLOADING INT AND STRING

        int [] reverseInt = reverseArray(num1);
        System.out.println(Arrays.toString(reverseInt));

        String [] reverseStr = reverseArray(str1);
        System.out.println(Arrays.toString(reverseStr));
    }

    public static int[] reverseArray(int[] num1) {

        int[] num2 = new int[num1.length];

        for (int i = num1.length - 1, j = 0; i >= 0; i--, j++) {

                num2[j] = num1[i];
        }
        return num2;
    }

    public static String[] reverseArray(String[] str1) {

        String[] str2 = new String[str1.length];

        for (int i = str1.length - 1, j = 0; i >= 0; i--, j++) {

            str2[j] = str1[i];
        }
        return str2;
    }
}
