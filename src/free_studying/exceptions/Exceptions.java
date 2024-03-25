package free_studying.exceptions;

public class Exceptions {
    public static void main(String[] args) throws Exception{

        method1(-1);
        method2(4);

    }

    public static void method1(int n){
        if(n<0){
            throw new ArithmeticException("No negative numbers allowed");
        }
        System.out.println(n);
    }
    public static void method2(int n) throws Exception
    {
        if ((n%2==0)){
            throw new Exception("Even number");
        }
    }
}
