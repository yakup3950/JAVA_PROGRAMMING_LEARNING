package m21_methods_part2;

public class ReturnKeywordInVoidMethod {
    public static void main(String[] args) {

        returnKeywordInVoid(180);
    }

    public static void returnKeywordInVoid(int age){
        if(age<0 || age>150){
            System.err.println("Invalid age");
            return;
        }

        if(age>=18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are NOT eligible to vote");
        }
    }
}
