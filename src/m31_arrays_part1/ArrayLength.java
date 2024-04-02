package m31_arrays_part1;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {

        String[] names = {"Yakup", "Huriye", "Duygu", "Arzu"};
        System.out.println("1- " + Arrays.toString(names));
        System.out.println("2- " + names.length);

        int lastIndexNumber = names.length - 1;
        System.out.println("3- " + "lastIndex is " + "\""+lastIndexNumber+"\"" + " --> " +names[lastIndexNumber]);

        System.out.println("-----------------------------------");

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("4- " + numbers);
        System.out.println("5- " + Arrays.toString(numbers));

        System.out.print("6- ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("7- ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        //EASY FOR LOOP CALLING --  (numbers.fori)
        for (int i = 0; i < numbers.length; i++) {            
        } 
        //EASY REVERSE FOR LOOP CALLING --  (numbers.forr)
        for (int i = numbers.length - 1; i >= 0; i--) {
            
        }          
        }

    }

