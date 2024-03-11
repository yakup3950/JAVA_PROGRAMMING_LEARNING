package m12_operators_part2;

public class ShorthandOperators {
    public static void main(String[] args) {

        // addition assignment operator +=

        int x = 5;
        x += x + 5;
        System.out.println("x = " + x);

        // subtraction assignment operator -=

        int y = 10;
        y -= 4;
        System.out.println("y = " + y);

        // Multiplication assignment operator *=

        int t = 7;
        t *= 3;
        System.out.println("t = " + t);

        // Division assignment operator /=

        double z = 45;
        z /= 7;
        System.out.println("z = " + z);

        // Modulus assignment operator %=

        int k = 10;
        k %= 3;
        System.out.println("k = " + k);

        // Different data types

        int c = 4;
        c += 20.5;

        System.out.println("c = " + c);
    }
}
