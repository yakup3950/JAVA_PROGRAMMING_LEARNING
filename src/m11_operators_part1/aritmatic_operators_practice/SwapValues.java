package m11_operators_part1.aritmatic_operators_practice;

//Write a code to swap the values of 2 int values by using temp value.

public class SwapValues {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 10;
        int num4 = 5;

        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

    }
}
