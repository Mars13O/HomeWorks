package week11;

import java.util.HashMap;
import java.util.Map;

public class Akhgar_Week11 {

    public static void CharFrequency(String input){
        Map<Character, Integer> freMap = new HashMap<>();

        // bellow line code will convert the input String to lowercase
        input = input.toLowerCase();

        // Iterate over each char in the string.
        for (char ch : input.toCharArray()){
            freMap.put(ch,freMap.getOrDefault(ch,0)+1);
        }
        // print the frequency of each char
        for (Map.Entry<Character, Integer> entry: freMap.entrySet()){
            System.out.println("Character: " + entry.getKey()+ ", Frequency: "+ entry.getValue());
        }
    }

    // TASK_2 (MAP_MIN_VALUE)

    public static <K, V extends Comparable<V>> V getMinValue(Map<K, V> map) {
        V minValue = null;
        // bellow code will iterate over the values in the map.

        for (V value : map.values()) {
            // will check if the minValue is null or it's smaller to the current value

            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        String str = "Java Task 11";
        CharFrequency(str);

        //task_2 Example:
        Map<String, Integer> myMap = Map.of("a",3,"b",4,"c",10,"d",2,"e",1);
        final Integer minValue = getMinValue(myMap);
        System.out.println("Minimum Value is: = " + minValue);
    }
}
