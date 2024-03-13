package m14_selection_statements_part1.Tasks;

public class NumbersTask2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 0;
        int c = 0;

        if (a < 10){
            b=1;
            System.out.println("b = " + b);
        }else if(a>10){
            c=1;
            System.out.println("c = " + c);
        }else {
            b=0;
            c=0;
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
    }
}
