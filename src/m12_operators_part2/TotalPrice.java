package m12_operators_part2;

//Given an item'm price(with tax) and quantity, write a program to calculate total price of any item using shorthand assignment operators.
// input: price:20.5 - Quantity:4  / Output:82
public class TotalPrice {
    public static void main(String[] args) {

        double price = 45 ;
        int quantity = 14;
        price *= quantity;

//        double totalPrice;
//        totalPrice = price * quantity;

        System.out.println("price = " + price);

    }
}
