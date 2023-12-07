package week10;

import java.util.ArrayList;

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
    }
}

