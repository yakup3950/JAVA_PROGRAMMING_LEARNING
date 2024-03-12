package m12_operators_part2.Tasks;
public class EligibilityForDriving {
    public static void main(String[] args) {

        double residentAge = 15.5;
        boolean hasDriverLicence = false;
        boolean hasLearnersPermit = true;

        boolean result = (residentAge >= 15.5 && residentAge < 18 && hasLearnersPermit) || (residentAge >= 18 && hasDriverLicence);
        System.out.println("Is eligible for drive? " + result);

    }
}
