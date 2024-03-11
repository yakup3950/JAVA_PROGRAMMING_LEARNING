package m11_operators_part1;

public class Addition_VS_Concatination {
    public static void main(String[] args) {
        System.out.println (3 + 5);
        System.out.println (3 + 5 + "Cydeo" + 3 + 5);
        System.out.println (3 + 5 + "Cydeo" + (3 + 5));
    }
}
