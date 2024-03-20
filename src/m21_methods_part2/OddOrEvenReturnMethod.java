package m21_methods_part2;

public class OddOrEvenReturnMethod {
    public static void main(String[] args) {

        int num = 1;
        String result = oddOrEven(num);
        System.out.println(result);

    }

    public static String oddOrEven(int num){
        String result;

        if(num%2==0){
            result = num + " is EVEN";
        }else {
            result = num + " is ODD";
        }
        return result;
    }
}
