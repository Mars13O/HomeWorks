package Ali.week6;

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */

public class Array_max_number {

    public static void main(String[] args) {

        int [] practice = {5,2,5,7,9,0,4};
        maxNum(practice);

    }


    public static int maxNum (int[] arr){
        int max = arr[0]; // used the first element as default value.

        for (int each : arr) { // each= each number
            if (each > max){ // if number is more than max
                max = each; // replace max to that number
            }

        }

        System.out.println(max);
        return max;
    }

    // for each loop ==> iterate the whole Array, it compares each number of the Array with the variable Max, and anytime found the bigger number, assigning that number to the Max.

}
