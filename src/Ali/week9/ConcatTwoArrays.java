package Ali.week9;

//1) Array - Concat two arrays
//Write a return method that can concate two arrays

import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 5};
        int[] arr2 = {2, 1, 6, 9};

        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length]; // Create a new array (merged) with a length equal to the sum of the lengths of arr1 and arr2. it'll be used to store the concatenated elements of arr1 and arr2.


        // i: read the elements from arr1, also add to the merged array
        // y: read the elements from arr2

        for (int i = 0, y = 0;  i < merged.length; i++) {

            if(i < arr1.length){ // Check if i is within the bounds of arr1:
                merged[i] = arr1[i];

            }else{
                merged[i] = arr2[y++]; // copy elements from arr2:
            }
        }
        return merged;
    }
}
