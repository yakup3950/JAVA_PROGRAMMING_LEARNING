package m15_selection_statements_part2.Tasks;
public class TrafficLightsSwitchWithLambdaStatement {
    public static void main(String[] args) {

        char choice = 'G';

        switch (choice) {
            case 'R', 'r' -> System.out.println("RED");
            case 'Y', 'y' -> System.out.println("YELLOW");
            case 'G', 'g' -> System.out.println("GREEN");
        }
    }
}
