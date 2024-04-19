package m40_oop_part2_encapsulation;

public class PersonClient {

    public static void main(String[] args) {

        Person person1 = new Person();
        //person1.name = "John Doe";
        //person1.age = 41;
        //System.out.println(person1.getName());
        person1.setName("Yakup");
        System.out.println(person1.getName());
        person1.setAge(-41);
        System.out.println(person1.getAge());
    }

}
