package m38_oop_part1_constructor;

class Apple {

    String color = "red";
    String name = "Starking";

}

//In a file there might be only one public class and this class name should be matching with the file name.
public class PassingObjectsToMethods {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        System.out.println(apple1.color);
        System.out.println(apple1.name);

        //changeAppleColor(new Apple()); //red-starking-red-starking
        changeAppleColor(apple1);        //red-starking-white-fuji
        System.out.println(apple1.color);
        System.out.println(apple1.name);
    }


    public static void changeAppleColor(Apple apple) {
        apple.color = "white";
        apple.name = "Fuji";
    }

}
