package week10;

import java.util.*;

public class IlonaWeek10 {
    public static void main(String[] args) {
        //Task1
        /*
        ArrayList - sorting in ascending
        Write a method that can sort the ArrayList in Ascending order without using
        the sort method.

         */

        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original ArrayList: " + numbers);

        bubbleSort(numbers);

        System.out.println("Sorted ArrayList (Ascending): " + numbers);
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1) > list.get(i)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            // After each iteration, the largest unsorted element is at the end,
            // so we can reduce the range to sort.
            n--;
        } while (swapped);

        /*
        ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.

         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original ArrayList: " + numbers);

        // Sorting in descending order
        descendingSort(numbers);

        System.out.println("ArrayList after descending sort: " + numbers);
    }

    // Method to perform descending order sorting
    public static void descendingSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is less than the next element
                if (list.get(j) < list.get(j + 1)) {
                    // Swap elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        /*
        Map - Sort the map by values
Write a method that can sort the Map by values.
         */

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("one", 1);
        unsortedMap.put("three", 3);
        unsortedMap.put("five", 5);
        unsortedMap.put("two", 2);
        unsortedMap.put("four", 4);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(unsortedMap.entrySet());
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0 ; j <entries.size()-1; j++){
                if(entries.get(j).getValue()> entries.get(j+1).getValue()){
                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j,entries.get(j+1));
                    entries.set(j+1,temp);
                }
            }
        }
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each :entries) {
        sorted.put(each.getKey(), each.getValue());
        }
        System.out.println("sorted Map"+ sorted);
    }
}