package m14_selection_statements_part1.Tasks;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        int a = -30;
        int b = 30;
        String result;

    if(a != b){
        if(a > b){
            result = a + " greater than " + b;
        }else {
             result = b + " greater than " + a;
        }
        System.out.println(result);
    }else {
        System.err.println("NUMBERS ARE EQUAL");
    }

    }
}
