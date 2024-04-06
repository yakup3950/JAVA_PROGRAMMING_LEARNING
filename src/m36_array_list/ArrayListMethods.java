package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> groceriesList = new ArrayList<>();

        System.out.println(groceriesList);

        // add(object): appends the specific element to the end of a list.

            groceriesList.add("egg");
            groceriesList.add("Paper Towel");
            groceriesList.add("Apple");
            groceriesList.add("Banana");
            groceriesList.add("egg");

            System.out.println(groceriesList);

        // add(index, object): inserts the specific element at a specific position index in the list.

            groceriesList.add("Chicken");
            System.out.println(groceriesList);
            groceriesList.add(2,"Noodle");
            System.out.println(groceriesList);

        // size(): Returns the number of elements in list.

            System.out.println(groceriesList.size());

        // get(index): Returns the element at the given index.

            String firstElement = groceriesList.get(0);
            System.out.println("firstElement : " + firstElement);
            String lastElement = groceriesList.get(groceriesList.size() - 1);
            System.out.println("lastElement : " + lastElement);

        // set(index, object): Replaces the element at the given index with the given element.

            groceriesList.set(2, "Orange");
            System.out.println(groceriesList);

        // remove(int): Removes/Returns value at given index.

            groceriesList.remove(1);
            System.out.println(groceriesList);

        // remove(Object): Removes the first occurrence of the specified element from this list, if it is present.

            groceriesList.remove("egg");
            System.out.println(groceriesList);

        // indexOf(object): Returns the index the first occurrence of a specific element.

            System.out.println(groceriesList.indexOf("Orange"));
            groceriesList.add("Apple");
            System.out.println(groceriesList);
            System.out.println("First index of apple : " + groceriesList.indexOf("Apple"));

        // lastIndexOf(object): Returns the index in this list of the last occurrence of the specified element.

            System.out.println("Last index of apple : " + groceriesList.lastIndexOf("Apple"));

        // contains(object): Returns true if this list contains the specified element.

            System.out.println("groceriesList.contains(\"Banana\") = " + groceriesList.contains("Banana"));
            System.out.println("groceriesList.contains(\"Milk\") = " + groceriesList.contains("Milk"));

        // isEmpty(): Returns true if this list contains no elements.

            System.out.println("groceriesList.isEmpty() = " + groceriesList.isEmpty());

            //groceriesList.clear();
            System.out.println(groceriesList);
            System.out.println("groceriesList.isEmpty() = " + groceriesList.isEmpty());

        // removeIf(Predicate): It is used to remove all the elements from the list that satisfies the given predicate.

            groceriesList.removeIf(p -> p.contains("A"));
            System.out.println(groceriesList);
    }
}
