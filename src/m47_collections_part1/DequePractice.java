package m47_collections_part1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {

    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Strawberry");
        queue.offer("Cherry");
        queue.offer("Lemon");

        System.out.println(queue);
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());

        queue.offerFirst("egg");
        queue.offerLast("pumpkin");
        System.out.println(queue);

        queue.pollFirst();//FIFO
        queue.pollLast(); //LIFO
        System.out.println(queue);


    }
}
