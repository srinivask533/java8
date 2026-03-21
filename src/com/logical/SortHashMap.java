package src.com.logical;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        // Use generics (no raw types) and avoid Java 8 streams/lambdas
        Map<String, Integer> map = new HashMap<>();
        map.put("Hyderabad", 1);
        map.put("Bangalore", 2);
        map.put("Chennai", 3);
        map.put("Kolkata", 4);
        map.put("Mumbai", 5);
        map.put("Agartala", 6);

        System.out.println("Original: " + map);

        // 1) Natural key order using TreeMap (no streams)
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted by key (natural): " + sortedMap);

        // 2) Reverse key order without Java 8 features: sort keys and build a LinkedHashMap
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        Map<String, Integer> sortedByKeyDesc = new LinkedHashMap<>();
        for (String k : keys) {
            sortedByKeyDesc.put(k, map.get(k));
        }
        System.out.println("Sorted by key (reverse): " + sortedByKeyDesc);

        sortMapkeys(map);
    }

    public static void sortMapkeys(Map<String, Integer> map){
        TreeMap treeMap  = new TreeMap(map);
        System.out.println(treeMap);

    }


}
