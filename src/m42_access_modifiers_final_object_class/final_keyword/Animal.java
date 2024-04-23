package m42_access_modifiers_final_object_class.final_keyword;

public class Animal {

    private String name;
    public final String breed;
    public final String gender;
    public int age;

    public final static String PLANET; //if we need 1 copy of this we are using static final.

    static {
        PLANET = "EARTH";
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal(String breed, String gender, String name, int age) {
        this.breed = breed;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public void drink() {

        System.out.println(name + " is a drinking water.");

    }
}
