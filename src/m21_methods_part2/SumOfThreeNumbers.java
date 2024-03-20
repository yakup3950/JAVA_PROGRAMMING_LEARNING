package m21_methods_part2;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        int num3 = 25;
        sumOfThreeNumbers(num1, num2, num3);

        int a = 50;
        byte b = 70;
        short c = 100;
        sumOfThreeNumbers(a,b,c);

        int x = 100;
        long y = 250;
        long z = 2_500_000;
        sumOfThreeNumbers(x, (int) y, (int) z);
    }

    public static void sumOfThreeNumbers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
    }
}
