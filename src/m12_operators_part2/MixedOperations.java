package m12_operators_part2;

public class MixedOperations {
    public static void main(String[] args) {

        byte num1 = 100;
        short num2 = 20;
        short num3 = (short)(num1 + num2);
        System.out.println("num3 = " + num3);

        int a = 100;
        long b = 200;
        int c = (int)(a + b);
        System.out.println("c = " + c);

        int aa = 100;
        long bb = 200;
        long cc = aa + bb;
        System.out.println("cc = " + cc);

        short x = 2;
        float y = 2.5f;
        int z = (int)(x * y);
        float zz = x * y;
        System.out.println("z = " + z);//5
        System.out.println("zz = " + zz);//5.0

    }
}
