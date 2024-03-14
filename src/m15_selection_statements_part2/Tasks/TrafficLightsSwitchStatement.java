package m15_selection_statements_part2.Tasks;

public class TrafficLightsSwitchStatement {
    public static void main(String[] args) {

        char choice = 'g';

        switch (choice) {
            case 'R', 'r':
                System.out.println("RED");
                break;
            case 'Y', 'y':
                System.out.println("YELLOW");
                break;
            case 'G', 'g':
                System.out.println("GREEN");
                break;
        }
    }
}
