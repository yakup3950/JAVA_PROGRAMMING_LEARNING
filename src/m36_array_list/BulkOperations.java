package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // addAll(Collection): Adds all the elements in the specified Collection to the target Collection.

                list.addAll(Arrays.asList("Java", "Python", "C", "C++", "JavaScript", "Java", "Python", "C", "Pascal"));
                System.out.println(list);


        // containsAll(Collection): Returns true if the target Collection contains all the elements in the
        // specified Collection

                boolean isContain = list.containsAll(Arrays.asList("Java", "Python", "Ruby"));
                System.out.println(isContain);


        //removeAll(Collection): Removes from the target Collection all of its elements that are also contained
        // in the specified Collection.

                System.out.println(list);
                list.removeAll(Arrays.asList("C","C++"));
                System.out.println(list);

        //retainAll(Collection): Removes from the target Collection all its elements that are NOT also contained
        // in the specified Collection.

                list.retainAll(Arrays.asList("Java", "Python"));
                System.out.println(list);

        //clear(): Removes all elements from the Collection.

                list.clear();
                System.out.println(list);
    }
}
