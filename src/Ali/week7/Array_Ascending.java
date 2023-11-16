package Ali.week7;

import java.util.Arrays;

public class Array_Ascending {

    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 1, 9, 4};

        System.out.println(Arrays.toString(sortAscending(arr)));

    }






    public static int[] sortAscending(int[] arr){

        for (int i = 0; i < arr.length; i++) { // i: iterate through each element of the array


            // all the comparing is gonna happen in the inner loop

            for(int j =0; j < arr.length - 1; j++){   // j:  iterates from the beginning to the second-to-last element.


                // Compare adjacent elements and swap if they are in the wrong order

                if(arr[j] > arr[j + 1]) { // compare the elements: arr[j] and arr[j + 1]
                    int temp = arr[j]; //  temporary variable to hold the value of arr[j]
                    arr[j] = arr[j + 1 ]; // swap is happening
                    arr[j + 1 ] = temp; // swap has completed
                }
            }
            
        }

        return arr;
    }




}
