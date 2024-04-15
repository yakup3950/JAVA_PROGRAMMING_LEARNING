package m38_oop_part1_constructor;

public class InstanceinitializationBlock {

    public String name;
    public int age;

    {
        name = "unknown";
        age = 42;
    }

    public InstanceinitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {


        // The initialized constructors are superior to the initialize blocks.

        InstanceinitializationBlock obj1 = new InstanceinitializationBlock("James", 65);

        System.out.println(obj1.name);
        System.out.println(obj1.age);

        System.out.println("---------------------------------------");

        // If there is non-parameter constructor initialize blocks are superior. It is expecting 2 arguments.

//        InstanceinitializationBlock obj2 = new InstanceinitializationBlock();
//
//        System.out.println(obj2.name);
//        System.out.println(obj2.age);


    }
}
