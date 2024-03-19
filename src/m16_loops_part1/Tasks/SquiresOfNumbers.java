package m16_loops_part1.Tasks;

public class SquiresOfNumbers {
    public static void main(String[] args) {
        System.out.println("\tNumber      |      Square of Number");
        System.out.println("\t____________________________________");
        int square;
        for (int i = 1; i <= 10; i++) {
            System.out.print("\t" + i + "\t\t\t|");
            square = i * i;
            System.out.println("\t\t\t\t" + square);
        }
    }
}
