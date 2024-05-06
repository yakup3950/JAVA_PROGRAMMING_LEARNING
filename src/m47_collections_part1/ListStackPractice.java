package m47_collections_part1;

import java.util.Arrays;
import java.util.Stack;

public class ListStackPractice {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.addAll(Arrays.asList("apple", "orange", "banana", "apple", "grape", "banana", "apple", "grape", "banana"));

        System.out.println(stack);
        stack.push("apple");
        stack.push("orange");
        System.out.println(stack);
        System.out.println(stack.peek());
        String a = stack.peek();
        System.out.println(a);
        System.out.println(stack);
        String b = stack.pop(); //LIFO
        System.out.println("b : " + b);
        System.out.println(stack);
        System.out.println("------------------------------");

        String str = "Java Programming";

        Stack<Character> characters = new Stack<>();
        for (char ch : str.toCharArray()) {
            characters.push(ch);
        }

        String reverse = "";

        while (!characters.isEmpty()) {
            reverse += characters.pop();
        }
        System.out.println(reverse);


    }
}
