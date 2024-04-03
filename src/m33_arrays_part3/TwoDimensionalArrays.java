package m33_arrays_part3;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70};
        int[] arr3 = {80, 90};

        int[][] numbers = new int[3][]; //index:0,1,2

        numbers[0] = arr1;

        System.out.println("1.1- " + Arrays.toString(numbers));
        System.out.println("1.2- " + Arrays.deepToString(numbers));

        numbers[1] = arr2;
        numbers[2] = arr3;

        System.out.println("2.1- " + Arrays.toString(numbers));
        System.out.println("2.2- " + Arrays.deepToString(numbers));

        System.out.println("3.1- " + Arrays.toString(numbers[1])); //Providing array
        System.out.println("3.2- " + numbers[2][1]); //Providing Integer
    }
}
