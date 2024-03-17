package week4_tasks;
/*
 	1.1 Given the following variables:
           - salesTaxRate (double)
           - itemName (String)
           - unitPrice (double)
           - quantity (int)

    1.2 The program should calculate the total cost before tax, the sales tax, and the grand total.

    1.3 The program should display them on the console in the following format:

         Example:
	           itemName = "Fuji Apple"
	           unitPrice = 1.5
	           quantity = 5
	           salesTaxRate = 8

         Output:
	           Item name: Fuji Apple
	           Unit price: $1.5
	           Quantity: 5

	           Total cost before tax: $7.5
	           Sales tax: $0.6
	           ==========================
	           Grand Total: $8.1
 */
public class PurchaseCalculator {
    public static void main(String[] args) {

        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;
        double salesTaxRate = 8;

        double totalCostWithoutTax =  quantity * unitPrice;
        double salesTax = totalCostWithoutTax * 8 / 100;
        double grandTotal = totalCostWithoutTax + salesTax;

        System.out.println("ItemName = " + itemName);
        System.out.println("Unit price =  $" + unitPrice);
        System.out.println("Quantity = " + quantity);
        System.out.println();
        System.out.println("Total cost before tax: $" + totalCostWithoutTax);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("=================================================");
        System.out.println("Grand Total: $" + grandTotal);
    }

}
