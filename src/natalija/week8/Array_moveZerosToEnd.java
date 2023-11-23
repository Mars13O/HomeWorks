package natalija.week8;

import java.util.Arrays;


public class Array_moveZerosToEnd {

    /*
    Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do
    Not Use Sort Method)
    Ex: input: {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {

        int[] nums = {1,0,2,0,3,0,4,0};
        int[] nums2 = {13,10,0,0,3,0,4,0,12};

        System.out.println(Arrays.toString(moveZeros(nums)));
        System.out.println(Arrays.toString(moveZeros(nums2)));
    }

    public static int[] moveZeros(int[] nums){

        int[] moved = new int[nums.length];
        int index = 0;

        for(int each : nums){
            if(each != 0){
                moved[index++] = each;
            }
        }

        return moved;
    }



}
