package m12_operators_part2.Tasks;

public class UnaryAndLogicalOperators {
    public static void main(String[] args) {
        int b=2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
                        // (3 == 2 || 3 == 2) &&
                        //  (false || false)  &&
                        //         false    &&

        System.out.println(result); //===>false
        System.out.println(b); //====> 3
    }

}
