package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ilona_Week09 {
    public static void main(String[] args) {
        //1) Array - Concat two arrays
        //Write a return method that can concate two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int []Array1AND2 = new int[array1.length+array2.length];

        for (int i = 0; i <array1.length ; i++) {
            Array1AND2[i] =array1[i];
        }

        for (int i = 0; i <array2.length; i++) {
           Array1AND2[array1.length + i] =array2[i];
        }
        System.out.println(Arrays.toString(Array1AND2));
      //2) ArrayList - Remove "Ahmed"
        //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //Write a java operation to remove all the names named Ahmed

        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        // Removing all occurrences of "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        // Displaying the updated ArrayList
        System.out.println("Updated ArrayList: " + names);

        //3) ArrayList - Remove some values
        //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        // Removing all values greater than 100
        numbers.removeIf(value -> value > 100);

        // Displaying the updated ArrayList
        System.out.println("Updated ArrayList: " + numbers);
    }
}
