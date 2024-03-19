package m18_loops_part3.Tasks;
public class OutputOfTheCode_Task3 {
    public static void main(String[] args) {
        int x = 20;
        while(x>0){
            do{
                x -= 2;
            }while (x>5);
        }
        x--;
        System.out.println(x);
    }
}
