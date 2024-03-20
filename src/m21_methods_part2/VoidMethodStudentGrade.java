package m21_methods_part2;

public class VoidMethodStudentGrade {

    public static void main(String[] args) {
        grade(415);
    }

    public static void grade(int score) {

        if (score > 100 || score < 0) {
            System.err.println("NOT APPLICABLE!..");
            return;
        }

        if (score >= 90 && score <= 100) {
            System.out.println("Excellent! Your average grade is " + score + " - A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Fine! Your average grade is " + score + " - B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Good...Your average grade is " + score + " - C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("So..So..Your average grade is " + score + " - D");
        } else if (score >= 0 && score <= 59) {
            System.err.println("Too bad!..Your average grade is " + score + " - F");
        }
    }
}
