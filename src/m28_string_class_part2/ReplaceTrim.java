package m28_string_class_part2;

public class ReplaceTrim {
    public static void main(String[] args) {
        String str = "Apple Apple Apple";
        System.out.println(str);
        System.out.println("============================================");
        System.out.println(str.replace("Apple", "Cherry"));
        System.out.println(str);
        str = str.replace("Apple", "Cherry");
        System.out.println(str);
        System.out.println("============================================");
        System.out.println(str.replaceAll("Cherry", "Banana"));
        System.out.println(str);
        str = str.replaceAll("Cherry", "Banana");
        System.out.println(str);
        System.out.println("============================================");
        System.out.println(str.replaceFirst("Apple", "Banana"));
        System.out.println(str);
        str = str.replaceFirst("Banana", "Apple");
        System.out.println(str);


       String str1 = "        Cydeo school           ";
        System.out.println(str1);
        System.out.println(str1.trim());
        System.out.println(str1);
    }

}
