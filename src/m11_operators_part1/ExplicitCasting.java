package m11_operators_part1;

public class ExplicitCasting {
    public static void main(String[] args) {

        double num1 = 100.5846;
        short num2 = (short)num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 500;
        byte num4 = (byte)num3;
        System.out.println("num4 = " + num4); // Data loss(Byte:128 x 4 = 512 / 500 - 512 = -12)

    }
}
