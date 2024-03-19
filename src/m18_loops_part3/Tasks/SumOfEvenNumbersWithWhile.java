package m18_loops_part3.Tasks;
// 2 4 6 8 10
public class SumOfEvenNumbersWithWhile {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while(num<11){
            if(num%2==0) {
                sum += num;
            }
            num++;
        }
        System.out.print(sum + " ");

    }
}
