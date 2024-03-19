package m18_loops_part3;

public class BranchingStatementsIntro {
    public static void main(String[] args) {
       /* for (char i ='A'; i < 'G'; i++) {
            if(i == 'C'){
                break; //Exits the current loop
            }
            System.out.print(i + " ");
        }*/
        System.out.println("---------------------");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if(i == 3){
                    continue;//Jumps to the next iteration.
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
