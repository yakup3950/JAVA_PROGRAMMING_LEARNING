package m12_operators_part2.Unary_Operators;

public class UnaryMoreComplicated {

    public static void main(String[] args) {

        int a = 10 ;
        a = --a + a++ + a-- + a++;
        //   9  + 9   + 10  + 9  ==> 37

        System.out.println(a); //a=37
    }
}
