package m14_selection_statements_part1;

public class Watermelon {
    public static void main(String[] args) {
        int number = 19;
        boolean isEnough = true;

        if (number >= 20) { //true
            System.out.println("I have more than 20 watermelons");
            isEnough = true;
        }
        if (isEnough){ //true
            System.out.println("good job");
        }
        if (!isEnough){ //!true ===> false
            System.out.println("I need more watermelon");
        }
    }
}
