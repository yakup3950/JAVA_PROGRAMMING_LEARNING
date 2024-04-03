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

        System.out.println("----------------------------------------");

        //index:              0           1          2
        int[][] arr2D = {{10,20,30},{40,50,60,70},{80,90}};
        //element:         0  1  2    0  1  2  3    0  1
        System.out.println("4.1-" + arr2D.length);
        System.out.println("4.2-" + Arrays.deepToString(arr2D));
        System.out.println("4.3-" + Arrays.toString(arr2D[1]));
        System.out.println("4.4-" + arr2D[1][2]);

        arr2D[2][1] = 100;
        System.out.println("4.2-" + Arrays.deepToString(arr2D));


        //n dimensional array is container for (n-1) dimensional arrays
        //2D arrays are container for 1D arrays
        //3D arrays are container for 2D arrays
    }
}
