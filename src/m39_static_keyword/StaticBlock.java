package m39_static_keyword;

public class StaticBlock {

    public static int num = 1000;

    static {
        num = 1000;
        System.out.println("Static block has executed");
    }

    public static void main(String[] args) {
        System.out.println("main method has executed");
        System.out.println(num);
    }
}
