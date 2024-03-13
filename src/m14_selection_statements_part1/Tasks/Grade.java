package m14_selection_statements_part1.Tasks;

public class Grade {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 60 && score < 100) {
            if (score < 90) {
                System.out.println("PASS");
            } else if (score <= 100 && score >= 90) {
                System.out.println("PASS WITH DISTINCTION");
            } else if (score < 60) {
                System.out.println("FAIL");
            }
        }else if (score > 100 || score < 0){
            System.err.println("INVALID SCORE");
        }
    }
}
