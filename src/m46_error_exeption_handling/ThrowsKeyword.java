package m46_error_exeption_handling;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Application Started");

        Thread.sleep(3000);

        System.out.println("Java Programming");

        Thread.sleep(3000);

        System.out.println("Application Ended");
    }

    public static void methodA() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void methodB() {
        // methodB(); STILL COMPLAINING
    }

    public static void methodC() {

        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void methodD() {
        methodC();
    }
}
