package m18_loops_part3.Tasks;

public class OutputOfTheCode_Task2 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if (start % 2 == 0) {
                start++;
            }
            sum += start;

        } while (++start <= 10);
        System.out.println(sum);
    }
}
