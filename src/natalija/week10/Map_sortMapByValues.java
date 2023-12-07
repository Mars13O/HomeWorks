package natalija.week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_sortMapByValues {

    /*
    Map - Sort the map by values
    Write a method that can sort the Map by values.
     */

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("c", 3, "g", 7, "j", 2, "t", 6, "q", 9);

        System.out.println(sortByValue(map));
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        for (int i = 0; i < entries.size(); i++) {

            for (int j = 0; j < entries.size() - 1; j++) {

                if(entries.get(j).getValue() > entries.get(j + 1).getValue()){
                    Map.Entry<String, Integer> temporary = entries.get(j);
                    entries.set(j, entries.get(j + 1));
                    entries.set(j + 1, temporary);
                }
            }
        }

        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : entries) {
            sorted.put(each.getKey(), each.getValue());
        }
        return sorted;
    }

}
