package m18_loops_part3;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*int n = 100;
        while (n < 0) {
            System.out.println("While Loop:hello World");
            n--;
        }
        System.out.println("=============================");

        do {
            System.out.println("Do-While Loop:hello World");
        } while (n < 0);*/
        System.out.println("=============================");


        int num=0;
        do{
            num++; //starts with one
            System.out.print(num + " ");
            num++; //starts with zero
        }while(num<11);
    }
}