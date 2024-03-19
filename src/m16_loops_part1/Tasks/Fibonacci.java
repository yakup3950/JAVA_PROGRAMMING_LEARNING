package m16_loops_part1.Tasks;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter a number for Fibonacci sequence:");
        int next = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c ;
        System.out.print("Fibonacci Sequence:");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= next; i++) {

            c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;

        }
    }
}
/*
      a + b      c
      0 + 1 -->  1
          c + b
          1 + 1 --> 2
              1 + 2 --> 3
                  2 + 3 --> 5
                      3 + 5 -->8

 */