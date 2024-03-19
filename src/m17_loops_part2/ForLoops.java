package m17_loops_part2;

public class ForLoops {
    public static void main(String[] args) {
    //Multiple variables of the same data type
        for (int i = 1, j=10, k=100, l=1000; i <=10 ; i++, j+=10, k+=100, l+=1000) {
            System.out.println(i + "==" + j + "==" + k + "==" + l);

        }
    }
}
