package m41_oop_part3_inheritance.inheritance_intro;

public class Cat extends Animal {

    public Cat(String name, String breed, String gender, int age, String color) {
        super(name, breed, gender, age, color);
    }

    public void scratch() {
        System.out.println(getName() + "is scratching");
    }
}
