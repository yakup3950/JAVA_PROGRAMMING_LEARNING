package m21_methods_part2;

public class ParametersArgumentsIntro {
    public static void main(String[] args) {
        int age = 25;

        eligibleToVote(age);
    }

    public static void eligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You ara NOT eligible to vote");
        }
    }
}
