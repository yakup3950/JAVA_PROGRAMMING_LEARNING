package m46_error_exeption_handling;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super("Invalid age exception occurred");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}


public class CustomException {


    public static void main(String[] args) {
        //throw new InvalidAgeException();
        throw new InvalidAgeException("AGE CAN NOT BE NEGATIVE");
    }
}
