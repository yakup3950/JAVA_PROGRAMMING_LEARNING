package m33_arrays_part3;

import java.util.Arrays;

public class Iterating2DArrays {
    public static void main(String[] args) {

        //index:              0                 1                     2
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100, 110, 120}};
        //element:         0   1   2     0   1   2   3   4     0   1    2    3

        for (int i = 0; i < arr2D.length; i++) {// index:0,1,2

            int[] each1DArray = arr2D[i];
            System.out.print(Arrays.toString(each1DArray));

            System.out.println();

            for (int j = 0; j < each1DArray.length; j++) {
                System.out.println((each1DArray[j]));
            }
        }

        System.out.println("1--------------------------------");

        //NESTED FOR EACH

        for (int[] each1DArray : arr2D) {

            System.out.println(Arrays.toString(each1DArray));

            for (int elements : each1DArray) {

                System.out.println((elements));
            }
        }

        System.out.println("2--------------------------------");

        for (int i = arr2D.length-1; i >= 0; i--) {// index:0,1,2

            int[] each1DArray = arr2D[i];
            System.out.print(Arrays.toString(each1DArray));

            System.out.println();

            for (int j = each1DArray.length-1; j>= 0; j--) {
                System.out.println((each1DArray[j]));
            }
        }
    }
}