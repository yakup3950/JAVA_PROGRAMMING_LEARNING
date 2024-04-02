package m32_arrays_part2;

import java.util.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {250, 590, 9, 40, 3, 10, 55};
        maximum$number1(numbers);
        maximum$number2(numbers);
        maximum$number3(numbers);
    }

    //method -1
    public static void maximum$number1(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);
    }


    //method -2
    public static void maximum$number2(int[] numbers) {
        int num = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > num) {

                num = numbers[i];
            }
        }
        System.out.println(num);
    }


    //method -3
    public static void maximum$number3(int[] numbers) {
        int num = 0;
        for (int number : numbers) {

            if (number > num) {

                num = number;
            }
        }
        System.out.println(num);
    }
}
