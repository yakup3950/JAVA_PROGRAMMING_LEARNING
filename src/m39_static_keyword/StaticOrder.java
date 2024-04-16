package m39_static_keyword;

public class StaticOrder {

    static int x = 5;

    static {

        x += 10;
        System.out.println("Static block1 has executed " + x);
    }

    static {

        x /= 3;
        System.out.println("Static block2 has executed " + x);
    }

    public static void main(String[] args) {
        System.out.println("x = " + x);
    }
}


