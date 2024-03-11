package m12_operators_part2;

public class LogicalComplement {
    public static void main(String[] args) {

        boolean isEligible = true;
        System.out.println("isEligible = " + isEligible);
        System.out.println("!isEligible = " + !isEligible);
        
        boolean passed = true;
        System.out.println("!passed = " + !passed);

        boolean isMarried = false;
        System.out.println(!isMarried);
    }
}
