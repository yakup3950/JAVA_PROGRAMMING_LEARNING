package m21_methods_part2;

public class PassByValue {
    public static void main(String[] args) {

        int a = 15;
        displayTheCube(a);
        System.out.println("a = " + a);;
    }

    public static void displayTheCube (int num){
        System.out.println("The number is: " + num);
        num = num * num * num;
        System.out.println("Cube is: " + num);
    }
}
