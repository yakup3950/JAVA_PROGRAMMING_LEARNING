package m47_collections_part1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListLinkedListPractice {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));
        list.add("strawberry");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(4));
    }
}
