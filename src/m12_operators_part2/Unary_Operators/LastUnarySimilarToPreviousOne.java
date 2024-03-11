package m12_operators_part2.Unary_Operators;

public class LastUnarySimilarToPreviousOne {
    public static void main(String[] args) {

        int x = 4;
        int y =--x * 4 - x++;
        //       3 * 4 - 3  ==>  x=4 , y=9

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
