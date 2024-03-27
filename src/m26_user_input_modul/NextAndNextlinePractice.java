package m26_user_input_modul;

import java.util.Scanner;

public class NextAndNextlinePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your fullname :");
        String name = scan.nextLine();

        scan.close();

        System.out.println("Age : " + age);
        System.out.println(("Name : " + name));
    }
}
