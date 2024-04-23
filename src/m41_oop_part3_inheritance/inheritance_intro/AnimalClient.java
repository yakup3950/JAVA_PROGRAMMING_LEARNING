package m41_oop_part3_inheritance.inheritance_intro;

public class AnimalClient {

    public static void main(String[] args) {

        Object object = new Object();

        Dog dog = new Dog("Dog", "Rot", "Male", 2, "White");
        Cat cat = new Cat("Cat", "Black", "Female", 4, "Black");

        // dog.name = "Lucy";
        // dog.breed= "Husky";

        System.out.println(dog.getName());
        //dog.setName("Chunky");
        //dog.setBreed("Silver");

        // cat.name = "Max";
        // cat.breed = "Murphy";

//            cat.getName();
//            cat.setName("Mini");
//            cat.setBreed("Hairy");

        System.out.println(dog);
        System.out.println(cat);

        dog.eat();
        dog.sleep();
        dog.bark();
        cat.eat();
        cat.sleep();
        cat.scratch();
        //cat.bark(); it does not contain.

    }
}
