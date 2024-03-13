package m14_selection_statements_part1;
public class Number {
    public static void main(String[] args) {
        int num = -10;

        if(num > 0){
            System.out.println("The number is positive");
        }else if(num==0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is negative");
        }
    }
}
