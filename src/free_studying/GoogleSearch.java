package free_studying;
/*
GoogleSearch [Wrapper class, String, testing/automation idea]

    Create a program that will define a String that is given in a fixed format based on how google search results are displayed.

    format: About 3,940,000,000 results (0.39 seconds)

    Scenario: check if your search results are under 100 Million
        if the results are under print: Good Search
        if the results are over print: Narrow your search, too many results

    AC: User should be able to search in google and get results back in under 0.85 seconds or less
    Test Case:
        Given user opens the browser and navigates to google.com
        Then searches for {data}
        Verify if the time is less than or equal to 0.85 seconds

            > check the number of seconds it took for the results to see if the functionality is working properly
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class GoogleSearch {
    public static void main(String[] args) {

String format = "format: About 3,940,000,000 results (0.39 seconds)";

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Search Results : ");
//        long searchResults = scanner.nextLong();
//
            Random rand = new Random();

            long searchResults =   rand.nextLong(120);
            System.out.println("RANDOM SEARCH RESULTS: " + searchResults);
            double random = Math.random();
            System.out.println("RANDOM RANGE: " + random);

            if (searchResults <= 100 || random < 0.85) {
                System.out.println("Good Search");
                if (random <= 0.85){
                    System.out.println("the functionality is working properly");
                }else {
                    System.err.println("Check the functionality");
                }
            } else {
                System.err.println("Narrow your search, too many results");
            }
    }
}
