package m41_oop_part3_inheritance.inheritance_intro;

public class Dog extends Animal {

    public Dog(String name, String breed, String gender, int age, String color) {
        super(name, breed, gender, age, color);
    }

    public void bark() {
        System.out.println(getName() + "is barking");
    }

}
