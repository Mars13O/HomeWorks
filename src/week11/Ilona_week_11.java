package week11;

import java.util.HashMap;
import java.util.Map;

public class Ilona_week_11 {



        public static void main(String[] args) {
            String inputString = "Hello, World!";
            printCharacterFrequency(inputString);
        }

        public static void printCharacterFrequency(String input) {
            // Create a HashMap to store character frequencies
            Map<Character, Integer> charFrequencyMap = new HashMap<>();

            // Convert the string to an array of characters
            char[] charArray = input.toCharArray();

            // Iterate through each character in the array
            for (char c : charArray) {
                // Check if the character is already in the map
                if (charFrequencyMap.containsKey(c)) {
                    // If yes, increment the count
                    charFrequencyMap.put(c, charFrequencyMap.get(c) + 1);
                } else {
                    // If not, add the character to the map with count 1
                    charFrequencyMap.put(c, 1);
                }
            }

            // Print the character frequencies
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }


//Task number 2
            //Map - Min value
            //Write a method that can return the minimum value from a map (DO NOT
            //use sort method).

            Map<String, Integer> sampleMap = new HashMap<>();
            sampleMap.put("A", 10);
            sampleMap.put("B", 5);
            sampleMap.put("C", 15);

            int minValue = findMinValue(sampleMap);
            System.out.println("Minimum value: " + minValue);
        }

    public static <K, V extends Comparable<V>> V findMinValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map is null or empty");
        }

        // Initialize the minimum value with the first value in the map
        V minValue = null;

        // Iterate through the values to find the minimum
        for (V value : map.values()) {
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }

        return minValue;
    }
}