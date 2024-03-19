package m16_loops_part1.Tasks;

import javax.xml.namespace.QName;

public class FibonacciTwo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 8; i++) {

            sum = a + b;
            a=b;
            b=sum;
            System.out.print(sum + " ");

        }

    }
}
