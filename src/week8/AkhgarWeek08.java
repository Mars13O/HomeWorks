package week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AkhgarWeek08 {

    /*
    Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any
    such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    correct answers).
     */

    public static int[] generateArray(int n) {
        int[] arr = new int[n];
        int sum = 0;

        if (!(n > 1 && n < 100)) {
            throw new IllegalArgumentException("\"n\" should be a number between 1 and 100");
        }

        for (int i = 0; i < n - 1; i++) {
            int num;
            num =  (int) (Math.random() * 10 + 1);
            arr[i] = (i % 2 == 0) ? num : -num;
            sum += arr[i];
        }
        arr[n-1] = -sum;
        return arr;

    }
    public static void moveZeroToEnd(int[] arr) {
        int num = arr.length;
        int count = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < num) {
            arr[count++] = 0;
        }
    }


    public static void main(String[] args) {

        int[] arr = generateArray(4);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1, 0, 8, 0, 2, 6, 0, 3, 4, 0};
        moveZeroToEnd(arr1);
        System.out.println(Arrays.toString(arr1));
    }



}




