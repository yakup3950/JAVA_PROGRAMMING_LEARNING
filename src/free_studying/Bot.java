package free_studying;

import java.util.Scanner;

/*
Bot [while, Scanner, conditional]

	create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot

	user says | > bot responds

	hello | > world
	what is your age | > I was programmed in 2024
	who created you | > I was created by Saim (use your name)
	what can we talk about | > print a menu of the options the bot can respond to

	off | > haha you cannot turn me off I am invincible
	shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)

	bonus: keep track how many times you interacted with the bot
	bonus: keep a log of the conversation

 */
public class Bot {

    public static void main(String[] args) {
        // Print colored text with the background to the console
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        // ANSI escape code constants for background colors
        String BLACK_BG = "\u001B[40m";
        String WHITE_BG = "\u001B[47m";

        boolean logOff = true;
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        String conversation = "";
        String respond = "";

        System.out.println(RED + "Hello! I am mini-Bot." + RESET);

        do {
            System.out.println(RED + "Ask me something : " + RESET);
            String input = scan.nextLine().toLowerCase();

            switch (input) {

                case "how are you?" -> {
                    System.out.print("> ");
                    respond = YELLOW + "I am fine and you";
                }

                case "where are", "you from?" -> {
                    System.out.print("> ");
                    respond = YELLOW + "I am from Switzerland.";
                }

                case "how old are you?" -> {
                    System.out.print("> ");
                    respond = YELLOW + "I am 46 years old.";
                }

                case "hello" -> {
                    System.out.print("> ");
                    respond = YELLOW + "Hello World.";
                }

                case "what is your age?" -> {
                    System.out.print("> ");
                    respond = YELLOW + "I was programmed in 2024.";
                }

                case "what can we talk about?" -> {
                    System.out.print("> ");
                    respond = YELLOW + "\"> The Power of Kindness\"\n" +
                            "\t\"> Overcoming Adversity\"\n" +
                            "\t\"> Exploring Space Travel\"\n" +
                            "\t\"> The Magic of Friendship\"\n" +
                            "\t\"> Discovering Hidden Talents\"\n" +
                            "\t\"> Protecting Endangered Species\"\n" +
                            "\t\"> The Joy of Learning\"\n" +
                            "\t\"> Unleashing Creativity\"";
                }

                case "off" -> {
                    System.out.print("> ");
                    respond = YELLOW + "haha you cannot turn me off I am invincible";
                }

                case "shutdown" -> {
                    System.out.print("> ");
                    respond = YELLOW + "hey bro you cannot turn me off I am invincible";
                }

                case "exit" -> {
                    System.out.print("> ");
                    respond = RED + "exiting...";
                }

                default -> {
                    System.out.print("> ");
                    respond = YELLOW + "---";
                }
            }
            System.out.println(respond);
            counter++;

            conversation += "Q : " + input + "\n" + "A : " + respond + "\n\n";
            if (input.equals("exit")) {
                logOff = false;
            }

        } while (logOff);
        System.out.println();
        System.out.println(RED + "Interaction time : " + counter);
        System.out.println(RED + "Conversation Log: " + RESET);
        System.out.println(conversation);
    }
}
