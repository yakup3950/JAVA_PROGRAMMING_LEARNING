package m48_collections_part2;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));
        System.out.println(list);

        Set<String> set = new HashSet<String>(list);  //Maintains the random order.
        set.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));

        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();  //Maintains the insertion order
        set1.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));
        System.out.println(set1);

        Set<String> treeSet = new TreeSet<>(); //it sorts the input in alphabetical order.
        treeSet.addAll(Arrays.asList("Zack", "Yulia", "Anna", "yakup", "Jack", "Breanna", "Emily", "ali", "daniel", "ahmet", "ben"));
        System.out.println(treeSet);

        Set<String> treeSet1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); //To make it case insensitive put an argument.
        treeSet1.addAll(Arrays.asList("Zack", "Yulia", "Anna", "yakup", "Jack", "Breanna", "Emily", "ali", "daniel", "ahmet", "ben"));
        System.out.println(treeSet1);
    }
}
