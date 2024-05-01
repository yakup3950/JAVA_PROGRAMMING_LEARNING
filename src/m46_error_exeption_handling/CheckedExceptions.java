package m46_error_exeption_handling;

public class CheckedExceptions {


    public static void main(String[] args) {
        System.out.println("Application started");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Java Programming");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Application ended");
    }


}
