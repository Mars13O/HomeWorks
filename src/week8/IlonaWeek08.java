package week8;

import java.util.Arrays;

public class IlonaWeek08 {
    public static void main(String[] args) {
        //#1 --Array - N unique integers that sum up to 0
        int N_number = 3;
        int[] result = new int[N_number];



        if (!(N_number > 1 || N_number < 100)) {
            throw new IllegalArgumentException("N_number should be between 1 and 100");
        }


        int sum = 0;

        for (int i = 0; i < N_number - 1; i++) {
            int randomNum = (int) (Math.random() * 10) + 1;//generate random integer
            result[i] = (i % 2 == 0) ? randomNum : -randomNum;
            sum += result[i];
        }
            result[N_number - 1] = -sum;

        System.out.println(Arrays.toString(result)); //print Array

        //2 Array - Move Zeros to the End
         int [] GivenArray = {1,0,5,2,0,5,0};

        int[] NumbersMoreThanZero =new int[GivenArray.length];
        int nonZeroIndex = 0;
        for (int i = 0; i < GivenArray.length-1; i++) {
if((GivenArray[i] != 0)){
    NumbersMoreThanZero[nonZeroIndex] = GivenArray[i];
     nonZeroIndex++;
}
        }

        System.out.println(Arrays.toString(NumbersMoreThanZero));
        }
    }




