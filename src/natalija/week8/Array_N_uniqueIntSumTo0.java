package natalija.week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_N_uniqueIntSumTo0 {

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


        public static void main(String[] args) {

            int N_num = 3;
            int N_num2 = 4;

            int[] result = generateArray(N_num);
            int[] result1 = generateArray(N_num2);

            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(result1));


        }

        public static int[] generateArray(int N_num) {
            if (!(N_num > 1 || N_num < 100)) {
                throw new IllegalArgumentException("N_num should be between 1 and 100");
            }

            int[] result = new int[N_num];
            int sum = 0;

            for (int i = 0; i < N_num - 1; i++) {
                int randomNum = (int) (Math.random() * 10) + 1;
                result[i] = (i % 2 == 0) ? randomNum : -randomNum;
                sum += result[i];
            }

            result[N_num - 1] = -sum;
            return result;
        }

}

