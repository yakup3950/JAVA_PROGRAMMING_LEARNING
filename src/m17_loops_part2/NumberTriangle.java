package m17_loops_part2;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
