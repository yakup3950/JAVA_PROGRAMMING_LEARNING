package m15_selection_statements_part2.Tasks;

public class LabtopModelsWithSwitchStatement {
    public static final int APPEL = 1;
    public static final int DELL = 2;
    public static final int HP = 3;
    public static void main(String[] args) {
//        String labtop1 = "Apple";
//        String labtop2 = "Dell";
//        String labtop3 = "HP";

        int choice =4;

        switch (choice) {
            case 1:
                System.out.println("Apple - no virus");
                break;
            case 2:
                System.out.println("Tough one");
                break;
            case 3:
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy that one");

        }

    }
}
