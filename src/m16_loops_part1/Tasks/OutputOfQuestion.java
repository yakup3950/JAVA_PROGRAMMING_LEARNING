package m16_loops_part1.Tasks;

public class OutputOfQuestion {
    public static void main(String[] args) {
        /*
        int i = 0;
        for (i = 0; i <= 2; i++) {
        }
        System.out.println(i);*/

        System.out.println("=====================================");

      /*  for (int j = 0; j < 10; j++) { //0-2-4-6-8
            j++;  //1-3-5-7-9
            System.out.println("Hello World");//1-2-3-4-5
        }
        System.out.println("=====================================");

        int k = 0;
        int m = 0;
        for (int l = 0; l <= 3; l++) { //0-1-2
            k++;//0 --> 1 --> 2 -->3
            if (l == 2) { // - 4
                l = 4;
            }
            m++;//0 --> 1 --> 2 --> 3
        }
        System.out.println(k + "," + m); // (3,3)
*/
        System.out.println("=====================================");
            int a= 0%5;
        int sum = 0;
        int j = 5;
        int i;
        for (i = 0; i < 10 && j > 0; i++, j--) {//i=0-->1-->2-->3-->4-->5   j=5-->4-->3-->2-->1-->0

            if (i % 3 == 0 || j % 5 == 0) {
                sum = sum + i + j;// - - 0+3+2=5 --> 5+5+0=10
            }
        }
        System.out.println("sum = " + sum); //5
        System.out.println("i = " + i); // 5
        System.out.println("j = " + j); //0
        System.out.println(a);
    }
}



