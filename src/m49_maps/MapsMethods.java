package m49_maps;

import java.util.*;

/*
Organize the following info:
name ------ Arthur
gender----- male
age-------- 35
job title-- Software Developer
salary----- 140000.00
full time-- true
 */
public class MapsMethods {
    public static void main(String[] args) {

        Map<String, Object> map = new LinkedHashMap<>();
        System.out.println(map);
        System.out.println(map.size());
        map.put("name", "Arthur");
        System.out.println(map);
        System.out.println(map.size());

        map.put("gender", "male");
        map.put("age", 45);
        map.put("job title", "Software Developer");
        map.put("salary", 140000.00);
        map.put("full time", true);
        System.out.println(map);
        System.out.println(map.size());
        map.putIfAbsent("age", 35);
        map.putIfAbsent("education", "Master");
        System.out.println(map);
        System.out.println(map.get("name"));
        // map.clear();
        System.out.println(map);
        map.remove("name");
        System.out.println(map);
        map.remove("education", "Master");
        System.out.println(map);
        System.out.println(map.containsKey("salary"));
        System.out.println(map.containsValue(35));
        System.out.println(map.isEmpty());

        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Object> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, Object>> entries = map.entrySet();
        System.out.println(entries);

    }
}
