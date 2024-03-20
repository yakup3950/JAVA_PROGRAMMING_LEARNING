package m20_methods_part1;

public class HierarchicalMethodCalls {
    public static void main(String[] args) {

        read();
        write();
        learn();
    }

    public static void read() {
        System.out.println("I am reading");
    }

    public static void write() {
        System.out.println("I am writing");
    }

    public static void learn() {
        read();
        System.out.println("I am learning");
        write();
    }
}

