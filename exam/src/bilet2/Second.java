package bilet2;

import java.util.HashMap;
import java.util.Map;

public class Second {
    Map<String, Integer> reverse(Map<Integer, String> map){
        Map<String, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, String> item : map.entrySet()) {
            Integer key = item.getKey();
            String value = item.getValue();
            if (!newMap.containsKey(key)) {
                newMap.put(value, key);
            }
        }
        return newMap;
    }

    void testing(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "a");
        for(Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("Key: %d; Value: %s \n", item.getKey(), item.getValue());
        }
        Second s = new Second();
        Map<String, Integer> newMap = s.reverse(map);
        for(Map.Entry<String, Integer> item : newMap.entrySet()) {
            System.out.printf("Key: %s; Value: %d \n", item.getKey(), item.getValue());
        }
    }
}