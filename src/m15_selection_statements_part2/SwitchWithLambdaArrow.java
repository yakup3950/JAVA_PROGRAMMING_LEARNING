package m15_selection_statements_part2;
public class SwitchWithLambdaArrow {
    public static void main(String[] args) {

        int a = 1;

        switch (a){

            case 1 -> {System.out.println("Monday");
                        System.out.println("is a weekday");}
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("INVALID NUMBER");
        }
    }
}
