package m46_error_exeption_handling;

import org.w3c.dom.ls.LSOutput;

public class ThrowingException {
    public static void main(String[] args) {
        Person person = new Person();
        //person.setName("");
        person.setAge(-10);
        System.out.println(person);
    }


}
