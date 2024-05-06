package m48_collections_part2;

import java.util.*;

public class ListSetQueue {

    public static void main(String[] args) {

        //LIST
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------");
        for (String each : list) { //foreach loop can be used for all the data structures.
            System.out.println(each);
        }

        System.out.println("-----------------------------------------");

        //SET
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));
        System.out.println(set);

        for (String each : set) {
            System.out.println(each);
        }
        System.out.println("---------------------------------------");

        //QUEUE

        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList("apple", "orange", "banana", "apple", "grape", "banana", "apple", "grape", "banana")); //does not accept the null and does not have index number.
        System.out.println(queue);
        System.out.println("------------------");
        for (String each : queue) {
            System.out.println(each);
        }
        System.out.println("====================");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);

        System.out.println("-----------------------------------------");

        //CONVERTING TYPES

        List<String> result = new ArrayList<>(set);
        System.out.println(result);
        System.out.println(result.get(2));
    }
}
