package week10;

import java.util.*;

public class SortMapByValuesAC {

    public static void main(String[] args){
        Map<String, Integer> map =  new HashMap<>();

        map.put("abdel",29);
        map.put("ayoub",28);
        map.put("fouad",31);
        map.put("nour",30);

        System.out.println("Map = " + map); // hashmaps give random order --> Map = {ayoub=28, nour=30, abdel=29, fouad=31}

        //after creating sort method below
        System.out.println("Sorted" + sortByValue(map)); //{ayoub=28, abdel=29, nour=30, fouad=31}


    }

    public static Map<String, Integer> sortByValue(Map<String,Integer>map){

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size()-1; j++) {

                if (entries.get(j).getValue() > entries.get(j+1).getValue()){

                    Map.Entry<String,Integer> miniMap = entries.get(j);
                    entries.set(j,entries.get(j+1));
                    entries.set(j+1, miniMap);
                }
            }
        }
        Map<String,Integer> sorted = new LinkedHashMap<>();

        for (Map.Entry<String,Integer> each : entries) {
            sorted.put(each.getKey(), each.getValue());
        }

        return sorted;


    }


}
