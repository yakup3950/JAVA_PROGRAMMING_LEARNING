package m26_user_input_modul;
import java.util.Scanner;
public class ScannerIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number to the console");
        Byte input1 = scan.nextByte();
        System.out.println("Enter your second number to the console");
        Short input2 = scan.nextShort();
        System.out.println("Enter your third number to the console");
        Integer input3 = scan.nextInt();
        System.out.println("Enter your first number to the console");
        Long input4 = scan.nextLong();
        scan.close();

        /*System.out.println("Enter your fifth number to the console");
        Integer input5 = scan.nextInt();*/


        System.out.println("FirstNum : " + input1);
        System.out.println("SecondNum : " + input2);
        System.out.println("ThirdNum : " + input3);
        System.out.println("FourthNum : " + input4);


    }


}
