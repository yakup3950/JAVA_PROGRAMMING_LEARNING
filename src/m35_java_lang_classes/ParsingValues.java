package m35_java_lang_classes;

public class ParsingValues {
    public static void main(String[] args) {

        String str = "20";
        int number = Integer.parseInt(str); //This will convert object to primitive data type, - primitive
        System.out.println(number + 1);

        Integer number1 = Integer.valueOf(str); //This will convert the wrapper class object. - object
        System.out.println(number1 + 1);

        Integer number2 = number;
        System.out.println(number2); //Autoboxing -object

        System.out.println("---------------------------------------");

        String str1 = "20.5";
        System.out.println(str1 + 1);

        double num3 = Double.parseDouble(str1);
        System.out.println(num3 + 1);

        double num4 = Double.valueOf(str); //Unboxing - it is converting object to primitive.
        Double num5 = Double.valueOf(str);

        System.out.println(num4 + 1);
        System.out.println(num5 + 1);
    }
}
