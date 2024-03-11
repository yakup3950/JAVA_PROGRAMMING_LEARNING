package m12_operators_part2;

public class IncrementDecrement {
    public static void main(String[] args) {
        // pre-increment and decrement examples
        int x = 5;
        int y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 10;
        int b = --a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //post-increment and decrement examples

        int m = 5;
        int n = m++;
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int r = 10;
        int t = r--;

        System.out.println("r = " + r);
        System.out.println("t = " + t);

    }
}
