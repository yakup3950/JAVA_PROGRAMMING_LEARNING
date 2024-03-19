package free_studying;
//Leap years
public class MonthsWithSwitch {
    public static void main(String[] args) {
        int monthNum = 2;
        int year = 2013;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        String result = null;
        int days;
        if (leapYear) {
            switch (monthNum) {
                case 1, 3, 5, 7, 8, 10, 12 -> result = "31";
                case 4, 6, 9, 11 -> result = "30";
                case 2 -> result = "29";
                default -> System.out.println("invalid");
            }
            System.out.println(monthNum + ". month has " + result + " days");
        }else {
            result = "28";
            System.out.println("This is not a leap year");
            System.out.println(monthNum + ". month has " + result + " days");
        }
    }
}