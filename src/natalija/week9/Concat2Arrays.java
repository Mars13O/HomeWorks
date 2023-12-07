package natalija.week9;

import java.util.Arrays;

public class Concat2Arrays {

    /*
    1) Array - Concat two arrays
    Write a return method that can concat two arrays
     */

    public static void main(String[] args) {
        int[] arr1 = {3, 7, 12};
        int[] arr2 = {4, 9, 12, 17};

        System.out.println(Arrays.toString(concat2Arrays(arr1, arr2)));

    }

    public static int[] concat2Arrays(int[] arr1, int[] arr2){

        int[] combined = new int[arr1.length + arr2.length];

        for(int i = 0, y = 0; i < combined.length; i++){

            if(i < arr1.length) {
                combined[i] = arr1[i];
            }else{
                combined[i] = arr2[y++];
            }
        }
        return combined;
    }

}
