package m38_oop_part1_constructor;

public class InstanceBlock {

    {
        System.out.println("InstanceBlock 1");
    }

    public InstanceBlock() {
        System.out.println("No argument constructor");

    }

    {
        System.out.println("InstanceBlock 2");
    }

    public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();

    }


}
