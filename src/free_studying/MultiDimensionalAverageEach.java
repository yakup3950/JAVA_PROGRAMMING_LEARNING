package free_studying;

import java.util.Arrays;

/*
AverageEach [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

    Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            average of: [3, 4, 5, 6] is 4.5
            average of: [5, 2, 6] is 4.3
            average of: [10, 40, 25] is 25.0
            average of all is 10.6

 */
public class MultiDimensionalAverageEach {

    public static void main(String[] args) {

//               nums          0           1            2
        int[][] nums = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 25}};
//                       0  1  2  3    0  1  2     0   1   2

        double lastAverage = 0.0;
        int[] firstArray;
        double lastSum = 0;

        for (int i = 0; i < nums.length; i++) {

                double[] arrays = new double[nums[i].length];
                int [] numbers = new int[nums[i].length];

                firstArray = nums[i];

            for (int j = 0; j < nums[i].length; j++) {

                numbers[i] += nums[i][j];
            }

                arrays[i] = (double) numbers[i] / nums[i].length;

                lastSum += arrays[i];

                lastAverage = lastSum / nums[i].length;

                System.out.println("average of : " + Arrays.toString(firstArray) + " is " + arrays[i]);

        }

            System.out.println("--------------------------------------");
            System.out.println("Last : " + lastAverage);

        }

    }

