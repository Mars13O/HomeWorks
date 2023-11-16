package Ali.week7;

import java.util.Arrays;

public class Array_Desc {


    public static void main(String[] args) {

        int[] arr = {2,5,7,3,9};

        System.out.println(Arrays.toString(sortDescending(arr)));
    }


    public static int[] sortDescending(int[] arr ){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++){

                if(arr[j] < arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }

        }

        return arr;

    }

    /*
    why j < arr.length - 1 in the inner loop ?
    The loop starts with j equal to 0 and continues as long as j is less than arr.length - 1. This is important because, inside the loop, there is a comparison of arr[j] and arr[j + 1]. If j were allowed to go up to arr.length, it would result in an attempt to access an index that is out of bounds, leading to an ArrayIndexOutOfBoundsException.
     */



}
