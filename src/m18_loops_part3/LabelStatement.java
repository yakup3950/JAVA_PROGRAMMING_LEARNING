package m18_loops_part3;

public class LabelStatement {
    public static void main(String[] args) {
        outer:
        for (int j = 1; j < 6; j++) {
            System.out.print(j + ": ");
            inner:
            for (char i = 'A'; i < 'E'; i++) {
                if (j == 3) {
                    break outer;//terminates the outer loop
                }
                System.out.print(i + " ");
            }
            System.out.println("/ ");
        }
    }
}
