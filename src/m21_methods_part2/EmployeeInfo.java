package m21_methods_part2;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter the name : ");
        String name = scanner.next();
        System.out.print("Enter the age : ");
        int age = scanner.nextInt();
        System.out.print("Enter the city : ");
        String city = scanner.next();


        System.out.println("THE INFO:");
        displayEmployeeInfo(name,age,city);

    }

    public static void displayEmployeeInfo(String name, int age, String city){

        System.out.println("The Employee name is " + name);
        System.out.println(name + " is " + age + " years old.");
        System.out.println((name + " is from " + city));
    }
}
