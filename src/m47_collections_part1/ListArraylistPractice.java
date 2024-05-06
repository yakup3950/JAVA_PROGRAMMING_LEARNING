package m47_collections_part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArraylistPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));

        removeDuplicates(list);

        System.out.println("List : " + list);
        System.out.println("List1 : " + list);

        List<String> list1 = new ArrayList<String>();
        list1.addAll(List.of("apple", "orange", "banana", "apple", "grape", "banana", "apple", "grape", "banana")); //DOES NOT ACCEPTS "NULL"

        System.out.println(list1);


       /*
       List<String> uniqueList = new ArrayList<>();

        for(String each : list){
            if(uniqueList.contains(each)){
                continue;
            }
            uniqueList.add(each);
        }
        System.out.println("uniqueList : " + uniqueList);

        */
    }


    public static void removeDuplicates(List<String> list) {

        List<String> uniqueList = new ArrayList<>();

        for (String each : list) {
            if (uniqueList.contains(each)) {
                continue;
            }
            uniqueList.add(each);
        }
        list.clear(); // clears all the elements in the list
        list.addAll(uniqueList);
    }
}
