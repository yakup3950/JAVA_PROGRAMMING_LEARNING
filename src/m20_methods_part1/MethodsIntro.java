package m20_methods_part1;

public class MethodsIntro {
    public static void main(String[] args) {
        System.out.println("Test started");
        eat();
        walk();
        MethodsIntro.play();
        System.out.println("Test completed");

    }

    public static void eat(){
        System.out.println("I am eating");
    }

    public static void walk(){
        System.out.println("I am walking");
    }

    public static void play(){
        walk(); // I am walking.
        System.out.println("I am playing");
    }
}
