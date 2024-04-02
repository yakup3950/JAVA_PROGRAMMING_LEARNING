package m31_arrays_part1;

import java.util.Arrays;
public class DeclareArray {
    public static void main(String[] args) {

        int[] scores = new int[5];
        scores[0] = 15;
        scores[1] = 25;
        scores[2] = 35;
        scores[3] = 45;
        scores[4] = 55;
        scores[0] = 65;

        System.out.println("1- " + scores);
        System.out.println("2- " + Arrays.toString(scores)); //to print the arrays you should use toString method with Arrays.
        System.out.println("3- " + scores[0]);
        System.out.println("4- " + scores[1]);
        System.out.println("5- " + scores[2]);
        System.out.println("6- " + scores[3]);
        System.out.println("7- " + scores[4]);
        //System.out.println("8- " + scores[5]); //ArrayIndexOutOfBoundsException

        System.out.println("-----------------------------------------");

        String[] names = new String[4];
        System.out.println("9- " + names);
        System.out.println("10- " + Arrays.toString(names));

        String[] types = {"Java", "Python", "C#", "Ruby", "C++"};//It should be declared in single line. Otherwise it will complain.
        System.out.println("11- " + types);
        System.out.println("12- " + Arrays.toString(types));
    }
}
