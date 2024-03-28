package m28_string_class_part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        int firstIndexOfA = str.indexOf("a");

        System.out.println("firstIndexOfA = " + firstIndexOfA);

        int secondIndexOfA = str.indexOf("a Programming");

        System.out.println("secondIndexOfA = " + secondIndexOfA);

        int thirdIndexOfA = str.indexOf("a", 5);

        System.out.println("thirdIndexOfA = " + thirdIndexOfA);

        int fourthIndexOfA = str.indexOf("a", thirdIndexOfA + 1);

        System.out.println("fourthIndexOfA = " + thirdIndexOfA);

        int lastIndexOfA = str.lastIndexOf("a");

        System.out.println("lastIndexOfA = " + lastIndexOfA);


    }
}
