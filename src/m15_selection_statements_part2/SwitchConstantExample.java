package m15_selection_statements_part2;

public class SwitchConstantExample {

    public static final int OPTION_ONE = 1;
    public static final int OPTION_TWO = 2;
    public static final int OPTION_THREE = 3;

    public static void main(String[] args) {

        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Option one is selected");
                break;
            case OPTION_TWO:
                System.out.println("Option two is selected");
                break;
            case 3:
                System.out.println("Option three is selected");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }
}
