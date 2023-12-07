package natalija.week06;

public class Array_FindMaximum {

    /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array

     */

    public static void main(String[] args) {
        int[] array = {6, 13, -2, -9, 0};
        System.out.println("maxNum(array) = " + maxNum(array));
    }


    public static int maxNum(int[] array) {

        int max = array[0];

        for (int each : array) {
            if (each > max) {
                max = each;
            }
        }

        return max;


    }

}
