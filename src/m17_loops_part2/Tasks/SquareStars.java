package m17_loops_part2.Tasks;

public class SquareStars {

    public static void main(String[] args) {
        int givenNumber = 20;
        String shape = "a";
        for (int i = 0; i < givenNumber; i++) {
            for (int j = 0; j <givenNumber; j++) {
                System.out.print(shape + " ");
            }
            System.out.println();
        }
    }
}
