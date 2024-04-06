package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.sort;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(5,2,8,5,1,10,10,8,8,8,8,5,2,2,2));
        System.out.println("Natural List : " + numbers);

        // sort(list): Sorts the elements of the given list in natural order.

            Collections.sort(numbers);
            System.out.println("Sorted List : " +numbers);

        // binarySearch(list, element): Searches for the specified value in a sorted list in ascending order
        // using a binary search algorithm.

            int index =  Collections.binarySearch(numbers,2);  //if  number of element even one step back of middle index
                                                                    //if number of elements even middlest of the index list
            System.out.println("index : " + index);

        // min(list): Returns the minimum element in the collection, according to the natural order.

            System.out.println("min : " + Collections.min(numbers));

        // max(list): Returns the maximum element in the collection, according to the natural order.

            System.out.println("max : " + Collections.max(numbers));

        // reverse(list): Reverses the order of elements in the list.

            Collections.reverse(numbers);
            System.out.println("Reverse : " + numbers);

        // shuffle(list): Randomly shuffles (randomly reorder) the elements in the list.

            //Collections.shuffle(numbers);
            //System.out.println("Random : " + numbers);
            //System.out.println("Random : " + numbers);

        // rotate(list, distance): Rotates the elements in the list by the specified distance.

            Collections.rotate(numbers,5); //positive distance from right to left
            System.out.println("Rotate : " + numbers);
            Collections.rotate(numbers,-5);//negative distance from left to right
            System.out.println("Rotate : " + numbers);

        // replaceAll(list, oldValue, newValue): Replaces occurrences of oldValue with newValue in the list.

            Collections.replaceAll(numbers, 8, 100);
            System.out.println("ReplaceAll : " + numbers);

        // frequency(list, element): Returns the frequency of occurrence of a value in the collection.

            int frequency = Collections.frequency(numbers, 100);
            System.out.println("Frequency : " + frequency);

        // fill(list, element): Replaces all elements of the list with the specified value.

            Collections.fill(numbers, 21);
            System.out.println("Fill : " + numbers);

    }
}
