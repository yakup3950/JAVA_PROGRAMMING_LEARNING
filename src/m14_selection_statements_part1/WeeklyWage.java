package m14_selection_statements_part1;

/*  Write a program to calculate weekly wage for a given working hours.

A company's normal weekly wage is $ 900. it is multiplied by 1.5 if an employee's working hours
is greater than 40.

 */
public class WeeklyWage {
    public static void main(String[] args) {

        double weeklyWage = 900;
        final double multiply = 1.5;
        final int workingHours = 40;
        int extraWorkingHours = 39;

        if (extraWorkingHours > workingHours) {
            weeklyWage *= multiply;
            System.out.println("actualWeeklyWage = " + weeklyWage);
        } else {
            System.out.println("actualWeeklyWage = " + weeklyWage);
        }
    }
}