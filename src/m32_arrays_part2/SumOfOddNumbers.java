package m32_arrays_part2;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int[] numbers = {2,3,5,4,9,6,7,6,8,9,1,1,1,4,5,5,3,7};

        System.out.println(sumOfOdds(numbers));

    }
    public static int sumOfOdds(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
