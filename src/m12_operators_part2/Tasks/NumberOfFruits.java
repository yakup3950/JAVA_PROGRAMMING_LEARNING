package m12_operators_part2.Tasks;
public class NumberOfFruits {
    public static void main(String[] args) {

            //   apple < orange >= strawberry
        int appleCount, orangeCount, strawberryCount;

        appleCount=5;
        orangeCount=6;
        strawberryCount=12;

        boolean result = (appleCount < orangeCount) || (orangeCount >= strawberryCount);

        System.out.println("result = " + result);


    }
}
