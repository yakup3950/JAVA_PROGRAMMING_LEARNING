package m21_methods_part2;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Result :");
        oddOrEven(number);

    }

    public static void oddOrEven(int number){
        if (number%2==0) {
            System.out.println("The " + number + " is EVEN");
        }else {
            System.out.println("The " +  number + " is ODD");
        }
    }
}


