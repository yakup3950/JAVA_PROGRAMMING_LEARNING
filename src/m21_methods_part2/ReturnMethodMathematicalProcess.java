package m21_methods_part2;

public class ReturnMethodMathematicalProcess {

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 20;
        char mathOpt = '*';

        System.out.println(calculate(num1, mathOpt, num2));
    }

    public static double calculate(double num1, char mathOperator, double num2) {
        boolean operators = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/' || mathOperator == '%';

        if (!operators) {
            return 0;
        }
            double result = (mathOperator == '+')?num1+num2:(mathOperator == '-')?num1-num2:(mathOperator == '*')?num1*num2:(mathOperator == '/')?num1/num2:0;
            return result;
    }
}

