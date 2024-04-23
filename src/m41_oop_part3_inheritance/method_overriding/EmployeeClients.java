package m41_oop_part3_inheritance.method_overriding;

public class EmployeeClients {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Yakup", 46, 100_000);
        Driver driver = new Driver("Arzu", 10, 150_000);
        Developer develope = new Developer("Duygu", 14, 250_000);

        System.out.println(teacher);
        System.out.println(driver);

        teacher.work();
        driver.work();
        develope.work();
    }


}
