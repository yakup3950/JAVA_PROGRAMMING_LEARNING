package free_studying;

import java.util.ArrayList;
import java.util.Arrays;

/*
Countries [array, String, loops]

    Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'

 */
public class Countries {
    public static void main(String[] args) {

        String[] countries = {"Brazil", "China", "Cubas", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};

        // =====Find and print all the first and last characters======

        String[] firstLastChars = new String[countries.length];

        for (int i = 0; i < countries.length; i++) {

            String firstChar = countries[i].substring(0, 1);
            String lastChar = countries[i].substring(countries[i].length() - 1);

            firstLastChars[i] = firstChar + lastChar;
        }
        System.out.println(Arrays.toString(firstLastChars));

        // =====Find the largest and smaller countries based on the length of their names=====

        int largest = Integer.MIN_VALUE;
        int smaller = Integer.MAX_VALUE;

        String country1 = "";
        String country2 = "";

        for (int j = 0; j < countries.length; j++) {

            if (countries[j].length() > largest) {  // LARGEST

                largest = countries[j].length();
                country1 = countries[j];

            }
        }
        for (int k = 0; k < countries.length; k++) {

            if (countries[k].length() < smaller) { // SMALLER
                smaller = countries[k].length();
                country2 = countries[k];
            }
        }
        System.out.println("with " + largest + " letters the LARGEST country is " + "\"" + country1 + "\"");
        System.out.println("with " + smaller + " letters the SMALLER country is " + "\"" + country2 + "\"");

        // - Show all the countries that start with a 'C'

        for (String country : countries) {
            if (country.startsWith("C")) {
                System.out.print(country);
                System.out.print(" / ");
            }
        }
        System.out.println();

        // - Show all the countries that end with an 's'
        //String[] countriesCount = new String[countries.length];
        ArrayList<String> countriesCount = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < countries.length; i++) {

            if (countries[i].endsWith("s")) {
                countriesCount.add(countries[i]);
                counter++;

                if (countriesCount.size() <= counter) {
                    System.out.print(" / ");
                } else {
                    System.out.print("");
                }
            }
        }
        System.out.print(countriesCount);
    }
//TODO I am gonna return this to handle backslash.
}


