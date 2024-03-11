package m12_operators_part2.Unary_Operators;

public class BasicUnary {
    public static void main(String[] args) {
        // -1-

        int x = 2;
        int y = x++;
        System.out.println(y);

        // -2-

        int a = 2;
        System.out.println(a++);

        // -3-

        int b = 2;
        System.out.println(b--);

        // -4-

        int k = 8;
        int m = k--;
        System.out.println(m);
    }
}
