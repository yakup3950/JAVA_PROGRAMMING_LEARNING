package m46_error_exeption_handling;

import java.util.ArrayList;

public class ErrorExample {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        while (true) {
            list.add(new Person()); //this provides an OutOfMemoryError. Since it is related with the system capacity. You can not handle it.
        }

    }
}
