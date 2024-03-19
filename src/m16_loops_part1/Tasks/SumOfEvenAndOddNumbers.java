package m16_loops_part1.Tasks;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i < 10; i += 2) {
            sumOdd += i;
        }
        for (int j = 0; j < 10; j+=2) {
            sumEven += j;
        }
            System.out.println("Sum of the Even number is = " + sumEven);
            System.out.print("Sum of the Odd number is = " + sumOdd);
        }
    }
