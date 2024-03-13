package m14_selection_statements_part1;
    //write a program that checks if a person eligible to vote for any given age.
    //if the age is greater or equal to 18, then the output should be "You are eligible to vote"
    // otherwise, "You are NOT eligible to vote"
public class EligibleToVote {
    public static void main(String[] args) {

        int age = 17;

        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are NOT eligible to vote");
        }
    }
}