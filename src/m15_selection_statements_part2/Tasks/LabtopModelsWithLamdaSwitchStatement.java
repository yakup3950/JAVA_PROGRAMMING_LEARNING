package m15_selection_statements_part2.Tasks;

public class LabtopModelsWithLamdaSwitchStatement {
        public static final int APPLE = 1;
        public static final int DELL = 2;
        public static final int HP = 3;
    public static void main(String[] args) {

        int choice = 2;

        switch (choice) {
            case 1 -> System.out.println("Apple - no virus");
            case 2 -> System.out.println("Tough one");
            case 3 -> System.out.println("Not recommended");
            default -> System.out.println("Do not buy that one");
        }
    }
}