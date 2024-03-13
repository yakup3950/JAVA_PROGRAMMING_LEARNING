package m14_selection_statements_part1.Tasks;

public class AverageScoresTask4 {
    public static void main(String[] args) {
        int math = 20;
        int chemistry = 30;
        int biology = 100;
        double average = (math + chemistry + biology) / 3;

        if(average >= 90 && average <= 100){
            System.out.println("Your average grade is " + average + " - A");
        }else if(average >= 80 && average <= 89){
            System.out.println("Your average grade is " + average + " - B");
        }else if(average >= 70 && average <= 79){
            System.out.println("Your average grade is " + average + " - C");
        }else if(average >= 60 && average <= 69){
            System.out.println("Your average grade is " + average + " - D");
        }else if(average >= 0 && average <= 59){
            System.err.println("Your average grade is " + average + " - F");
        }else {
            System.err.println("NOT APPLICABLE!..");
        }
    }
}
