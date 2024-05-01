package m46_error_exeption_handling;

public class UncheckedException {

    public static void main(String[] args) {
        // String str = "Java  Programming";
        String str = null;

        //System.out.println(str.toUpperCase());//NULL POINTER EXCEPTION

        //System.out.println(10/0);//ARITHMETIC EXCEPTION

        //System.out.println("Java".charAt(12)); INDEXOUTBOUNDOFEXCEPTION

        String a = "abc";

        int number = Integer.parseInt(a);
        System.out.println(number); //NUMBER FORMAT EXCEPTION
    }

}
