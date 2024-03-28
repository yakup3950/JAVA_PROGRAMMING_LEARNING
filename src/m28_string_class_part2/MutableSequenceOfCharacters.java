package m28_string_class_part2;

public class MutableSequenceOfCharacters {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java");


        stringBuilder.append(" Programming");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String result = stringBuilder.toString();
        System.out.println(stringBuilder);

        System.out.println(result = "Java");


        StringBuffer stringBuffer = new StringBuffer("Python");
        System.out.println(stringBuffer.append(" Programming"));
        System.out.println(stringBuffer.reverse());
    }
}
