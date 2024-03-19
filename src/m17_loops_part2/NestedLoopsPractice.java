package m17_loops_part2;

public class NestedLoopsPractice {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 4; i++) {
            System.out.println("Outer Loop Iteration " + i);
            for (int j = 1; j <= 3; j++) {
            System.out.print("i = " + i + " | ");
            System.out.println("j = " + j);
            }
        }
    }
}


