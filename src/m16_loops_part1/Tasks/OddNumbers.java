package m16_loops_part1.Tasks;

//1-3-5-7-9-11-13-15-17-19
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i);
            if(i<19){
                System.out.print("-");
            }
        }
    }
}
