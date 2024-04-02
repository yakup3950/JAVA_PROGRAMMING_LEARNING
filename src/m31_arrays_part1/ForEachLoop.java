package m31_arrays_part1;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // NO TOSTRING

        int[] numbers1 = {15, 30, 45, 60, 75, 90};
        System.out.print("1- ");
        for (int each1 : numbers1) {
            System.out.print(each1 + " ");
        }

        System.out.println();
        System.out.println("---------------------------");

        //TOSTRING

        int[][] numbers2 = {{15, 30, 45}, {60, 75, 90}};
        System.out.print("2- ");
        for (int[] each2 : numbers2) {
            System.out.print(Arrays.toString(each2));
        }
        System.out.println();
        System.out.println("---------------------------");

        //DEEPTOSTRING

        int[][][] numbers3 = {{{15, 30, 45}, {60, 75, 90}, {105, 120, 135}},
                {{160, 175, 190}, {205, 220, 235}, {250, 265, 280}},
                {{295, 310, 352}, {340, 355, 370}, {385, 400, 415}}};

        System.out.print("3- ");
        for (int[][] each3 : numbers3) {
            System.out.println(Arrays.deepToString(each3));
        }
        System.out.println();
        System.out.println("---------------------------");

        String[] names = {"Java", "Python", "C#", "C++"};

        for (String languages : names) {
            System.out.println(languages);
        }
    }
}

