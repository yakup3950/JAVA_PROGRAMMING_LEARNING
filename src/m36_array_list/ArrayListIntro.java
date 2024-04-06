package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        System.out.println("------------Array---------------");

            int[] arr = new int[5];
            System.out.println(Arrays.toString(arr));

            int[] arr2 = {10,20,30,40,50};
            System.out.println(Arrays.toString(arr2));

        System.out.println("------------ArrayList---------------");

            ArrayList<Integer>  list1 = new ArrayList<Integer>();
            System.out.println(list1);

                list1.add(10);
                System.out.println(list1);
                System.out.println("--------------------");

            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
            System.out.println(list2);

    }
}
