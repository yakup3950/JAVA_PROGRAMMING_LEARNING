package free_studying.uber;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;

/*
UberReceipt [String, indexes]

    create a program that will extract details from a receipt emailed to you from your uber ride
    extract the number of miles, number of minutes, and total cost

    here is an example receipt:

        String receipt = "Uber Receipts 2 days ago\n" +
                "Thanks for using Uber. Remember to rate your driver\n" +
                "The 5 mile trip took about 20 minutes\n" +
                "Your total was $25.19";

 */
public class UberReceipt {
    public static void main(String[] args) {

        String receipt = "Uber Receipts 2 days ago\n" +
                "Thanks for using Uber. Remember to rate your driver\n" +
                "The 5 mile trip took about 20 minutes\n" +
                "Your total was $25.19";

        String[] newReceipt = receipt.split(" ");

        System.out.println(Arrays.toString(newReceipt));

        System.out.println();
        String mailReceipt = receipt.substring(receipt.indexOf("day") - 2, receipt.indexOf("day") - 1);
        int receiptDay = Integer.valueOf(mailReceipt);

        String tripDistance = receipt.substring(receipt.indexOf("mile") - 2, receipt.indexOf("mile") - 1);
        int tripDistanceDay = Integer.valueOf(tripDistance);

        String tripDuration = receipt.substring(receipt.indexOf("minutes") - 3, receipt.indexOf("minutes") - 1);
        int tripDurationTime = Integer.valueOf(tripDuration);

        String totalCost = receipt.substring(receipt.indexOf("$") + 1);
        double totalCostAmount = Double.valueOf(totalCost);

        System.out.println("The receipt was " + mailReceipt + " " + 2 + " days ago");
        System.out.println("The mile is " + (tripDistance + 50));
        System.out.println("The trip was " + (tripDuration + 100) + " minutes");
        System.out.println("The cost is " + totalCost + 100.00 + " dollars");
        System.out.println("==============================================");
        System.out.println("The receipt was " + (receiptDay + 2) + " days ago");
        System.out.println("The mile is " + (tripDistanceDay + 50));
        System.out.println("The trip was " + tripDurationTime + 100 + " minutes");
        System.out.println("The cost is " + totalCostAmount + 1000.00 + " dollars");
    }


}
