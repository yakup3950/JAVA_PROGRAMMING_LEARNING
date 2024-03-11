package m11_operators_part1;

/*   Find the results of the expressions below and print them.
        10+5;10-5;10/5;10*5 - 10%3;9%2;14%2;1234%10   */

public class ArithmeticOperators {
    public static void main(String[] args) {

       /* int num1=10;
        int num2=5;
        int result1, result2, result3, result4, result5, result6, result7, result8;

        result1=num1+num2;
        System.out.println("result1 = " + result1);
        result2=num1-num2;
        System.out.println("result2 = " + result2);
        result3=num1/num2;
        System.out.println("result3 = " + result3);
        result4=num1*num2;
        System.out.println("result4 = " + result4);

        System.out.println("----------------------------------------");

        result5=10%3;
        System.out.println("result5 = " + result5);
        result6=9%2;
        System.out.println("result6 = " + result6);
        result7=14%2;
        System.out.println("result7 = " + result7);
        result8=1234%10;
        System.out.println("result8 = " + result8);

        System.out.println("----------------------------------------");*/

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 / 5);
        System.out.println(10 * 5);
        System.err.println(10 / 4); //2
        System.err.println(10.0 / 4);//2.5
        System.err.println(10 / 4.0);//2.5
        System.err.println(10D / 4);//2.5
        System.err.println(10 / 4D);//2.5

    }
}
