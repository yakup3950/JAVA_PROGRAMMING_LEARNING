package m47_collections_part1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Strawberry");
        queue.offer("Cherry");
        queue.offer("Lemon");
        queue.offer("Mango");
        queue.offer("Apple");

        queue.remove(); //FIFO
        queue.poll();   //FIFO

        String element = queue.peek();

        System.out.println(queue);
        System.out.println(element);
        System.out.println(queue.peek());
        System.out.println(queue);

        queue.remove("Lemon");
        System.out.println(queue);

        queue.add(null);
        System.out.println(queue); //NULL POINTER EXCEPTION
    }


}
