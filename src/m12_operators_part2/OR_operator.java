package m12_operators_part2;

public class OR_operator {
    public static void main(String[] args) {
        int x=50;

        System.out.println( (x<100) | (x>0) );
                        //   true   |  true  ===> true
        System.out.println( (x<100) || (x>0) );
                        //   true   ||  ----  ===> true
        System.out.println( (x>200) || (x<0) );
                        //   false   ||  false  ===> false
        System.out.println( (x>200) | (x<0) );
                        //   false   |  false  ===> false


    }
}
