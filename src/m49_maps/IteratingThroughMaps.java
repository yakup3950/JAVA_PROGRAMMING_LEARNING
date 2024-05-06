package m49_maps;

import java.util.*;

public class IteratingThroughMaps {

    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("name", "Arthur");
        map.put("gender", "male");
        map.put("age", 45);
        map.put("job title", "Software Developer");
        map.put("salary", 140000.00);
        map.put("full time", true);
        System.out.println(map);
        System.out.println("--------------------------");
        for (String eachKey : map.keySet()) {
            System.out.println(eachKey + " : " + map.get(eachKey));
        }

        System.out.println("--------------------------");
        for (Object eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--------------------------");
        for (Map.Entry<String, Object> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

        System.out.println("--------------------------");
        for (Map.Entry<String, Object> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.getKey());
        }

        System.out.println("--------------------------");
        for (Map.Entry<String, Object> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.getValue());
        }

        System.out.println("--------------------------");
        for (Map.Entry<String, Object> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.hashCode());
        }

        System.out.println("=================================");
        //ITERATOR
        Iterator<String> itr = map.keySet().iterator();
        System.out.println(map);
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key);
            if (map.get(key).equals("Arthur")) {
                itr.remove();
            }
        }
        System.out.println(map);

        System.out.println("=================================");
        //FOREACH

        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("=================================");
        //PERSON LIST
        Map<String, Object> person1 = new HashMap<>();
        person1.put("name", "Isabella");
        person1.put("gender", "female");
        person1.put("age", 39);

        Map<String, Object> person2 = new HashMap<>();
        person2.put("name", "Yulia");
        person2.put("gender", "female");
        person2.put("age", 32);

        Map<String, Object> person3 = new HashMap<>();
        person3.put("name", "Aaron");
        person3.put("gender", "male");
        person3.put("age", 45);

        List<Map<String, Object>> listOfMap = new ArrayList<>();

        listOfMap.addAll(Arrays.asList(person1, person2, person3));
        System.out.println(listOfMap);

        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);

            }
        }
    }
}
