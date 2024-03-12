package m12_operators_part2.Tasks;
public class EligibleForWork {
    public static void main(String[] args) {

        int birthday = 1957;
        int date = 2024;
        int age = date - birthday;
        boolean isEligible = (age >= 18) && (age < 65);

        System.out.println("Age is " + age + "." + " Am I eligible for work? " + isEligible);
    }
}
