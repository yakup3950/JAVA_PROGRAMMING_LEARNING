package m18_loops_part3.Tasks;
// 3 --> FIN / 5--> RA / 3 & 5 --> FINRA
public class FinraWithDoWhile {
    public static void main(String[] args) {
        int input = 200;
        int num = 0;
        //String result = null;
        do{
            num++;
            if(num%5==0 && num%3==0) {
                //result = "FINRA";
                System.out.print(" FINRA ");
            }else if(num%3==0){
                //result = "FIN";
                System.out.print(" FIN ");
            } else if(num%5==0) {
                //result = "RA";
                System.out.print(" RA ");
            }else {
                System.out.print(num + " ");
            }
            //result = (num%5==0)?((num%3==0)?"FINRA":"FIN"):"RA";
        }while(num < input);

    }
}
