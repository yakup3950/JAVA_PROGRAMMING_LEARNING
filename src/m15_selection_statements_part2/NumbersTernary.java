package m15_selection_statements_part2;

public class NumbersTernary {
    public static void main(String[] args) {
        int num = 10;

        /*if (num > 0) {
            System.out.println("The number is positive");
        } else if (num == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is negative");
        }*/
        String result;
        result = (num > 0) ? "The number is positive" :(num<0) ? "The number is negative" : "The number is Zero";
        System.out.println(result);
    }



}


