package m31_arrays_part1;

import java.util.Arrays;

public class ArraysUtilityClassIntro {

    public static void main(String[] args) {

        // toString(arr): Returns a string representation of the contents of this array
        int[] numbers = {43, 12, 4, 1, 3, 5};
                System.out.println("--------------------------");
                System.out.println("1.1- " + numbers);
                System.out.println("1.2- " + Arrays.toString(numbers));
                System.out.println("--------------------------");

        // equals(arr): checks if both arrays are equal, returns boolean
        int[] n1 = {4, 5, 6, 10, 100};
        int[] n2 = {4, 5, 6, 10, 100};
        int[] n3 = n1;

                System.out.print("2.1- ");
                System.out.println(n1 == n2);
                System.out.print("2.2- ");
                System.out.println(n1 == n3);
                System.out.println("2.3- " + Arrays.equals(n1,n2));
                System.out.println("--------------------------");

        // sort(arr): Sorts the elements of an array in ascending order
        int[] scores = {95, 85, 90, 65, 55, 75};
        String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic"};

                System.out.println("3.1- not sorted" + Arrays.toString(scores));
                Arrays.sort(scores); //it sorts the related array.
                System.out.println("3.2- sorted" + Arrays.toString(scores));
                //System.out.println("--------------------------");
                System.out.println("3.3- not sorted" + Arrays.toString(languages));
                Arrays.sort(languages);//it sorts the related array.
                System.out.println("3.4- sorted" + Arrays.toString(languages));

        // binarySearch(arr, value): Searches for the specified element in the array with the help of
        // the Binary Search Algorithm. The array must be sorted in ascending order.
        int[] numX = {4, 6, 18, 7, 10, 55};
                System.out.println("--------------------------");
                System.out.println("4.1 " + Arrays.binarySearch(numX, 7));//it does not work properly
                Arrays.sort(numX); //First you need to sort
                System.out.println("4.2 " + Arrays.binarySearch(numX, 7));
                System.out.println("--------------------------");

        // copyOf(arr, length): Copies the specified array (truncating or padding with default values if necessary)
        // and returns a new array.
        double[] d1 = {2.3, 4.5, 12.4};
        double[] d2 = d1; // not copied, one object ONLY

                System.out.print("5.1 ");
                System.out.println(d1==d2); //true
                System.out.println("5.2 " + Arrays.toString(d1));
                double[] newArray = Arrays.copyOf(d1, 10);
                System.out.println("5.3 " +Arrays.toString(newArray) );
                System.out.println("--------------------------");


        // copyOfRange(arr, from, to): copies the specified range of the specified array, and returns new array
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int[] newNums =Arrays.copyOfRange(nums, 2, 5);

                System.out.println("6 " + Arrays.toString(newNums));
                System.out.println("--------------------------");

        //fill(arr, value): Assigns the specified value to each element of the specified array.
        int[] nums2 = new int[5];

                System.out.println("7.1 " + nums2);
                System.out.println("7.2 " + Arrays.toString(nums2));
                Arrays.fill(nums2, 20);
                System.out.println("7.3 " + Arrays.toString(nums2));

    }

}
