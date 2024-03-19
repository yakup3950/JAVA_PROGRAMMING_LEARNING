package m17_loops_part2.Tasks;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {

                System.out.print(i + " x " + j + " = " + i * j);
                System.out.print("\t\t");
            }
            System.out.println("\t\t\t\t");
        }
    }
}
