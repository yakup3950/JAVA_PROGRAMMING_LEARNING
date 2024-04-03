package m32_arrays_part2;

import java.util.Arrays;
public class HowManyWords {
    public static void main(String[] args) {

        String str = "The sun rose over the horizon, casting a golden glow across the fields. Birds chirped happily in the trees, welcoming the new day. A gentle breeze rustled the leaves, carrying with it the scent of fresh grass. It was a peaceful morning, filled with promise and possibility.";

        //String[] a = findTheWordNumbers(str);
        char [] x = findTheWordNumbers(str);
        //int b = a.length;

        //System.out.println(Arrays.toString(a));
        //System.out.println(b);
        System.out.println(x);
        int y = x.length;
        System.out.println(Arrays.toString(x));
        System.out.println(y);
    }

//    public static String[] findTheWordNumbers(String str) {
//
//        if (str.contains(" ")) {
//            String[] wordsArray = str.split(" ");
//            return wordsArray;
//        }
//        return null;
//    }

    public static char[] findTheWordNumbers(String str) {

        char [] characters = str.replace(",","").replace(" ","").replace(". ","").replace(".","").toCharArray();
            return characters;
        }

    }



