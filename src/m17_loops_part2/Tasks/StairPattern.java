package m17_loops_part2.Tasks;

public class StairPattern {
    public static void main(String[] args) {
       /* ALTERNATIVE ONE
        int givenNumber=16;
        String shape ="A";
        for (int i = 1; i <= givenNumber ; i++) {
            System.out.print(" ");
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 1; k++) {
                System.out.print(shape);
            }
            System.out.println();
        }*/

        for (int i = 1; i <= 6; i++) {
            System.out.print(" ");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}