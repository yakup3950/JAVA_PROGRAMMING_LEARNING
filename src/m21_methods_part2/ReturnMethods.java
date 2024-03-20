package m21_methods_part2;

public class ReturnMethods {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        extractNumbers(num1,num2);
        System.out.println("===========");
        int result = addNumbers(num1, num2);
        System.out.println(result);
    }

    public static void extractNumbers(int num1,int num2){
        int num3 = num1-num2;
        System.out.println(num3);
    }

    public static int addNumbers(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }
}
