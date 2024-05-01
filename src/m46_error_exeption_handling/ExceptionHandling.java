package m46_error_exeption_handling;

import java.util.Arrays;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Application started");
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String RESET = "\u001B[0m";
        String str = null;

        try {
            System.out.println(str.toLowerCase());
//        }catch (NullPointerException e){
//            System.out.println(YELLOW + "Unexpected event : catch block executed -- NullPointerException" + RESET);
        } catch (Throwable e) {
            //System.out.println(YELLOW + "Unexpected event : catch block executed -- RunTimeException" + RESET);
            System.out.println("MESSAGE : " + e.getMessage());
            e.printStackTrace();
            System.out.println("======================================");
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println(BLUE + "optional block : finally block" + RESET);
        }

        System.out.println("Application ended");


        System.out.println("-----------------------------------------");

        try {
            System.out.println("Hello World");
            System.exit(0);//WAY OF NOT EXECUTING OF FINALLY BLOCK.
        } finally {                              //OPTIONAL (IT EXECUTES AT ANY RATE)
            System.out.println("finally block : finally block");

        }
    }
}
