package m15_selection_statements_part2;

public class TernaryVote {
   /* public static void main(String[] args) {
        int age = 28;
        String result;
        if (age >= 18) {
            result = "You are eligible to vote";
        } else {
            result = "You are NOT eligible to vote";
        }
        System.out.println(result);
    }*/

    //TERNARY VERSION OF THE EXAMPLE ABOVE
    public static void main(String[] args) {
        int age = 17;
        String result;
        result = (age >= 18) ? "You are eligible to vote" : "You are NOT eligible to vote";
        System.out.println(result);
    }
}
