package week7;

import java.util.Arrays;

public class Akhgar {

    public static int minValue(int[] aryValues) {

        int min = aryValues[0];
        for (int eachValue : aryValues) {
            if (min > eachValue) {
                min = eachValue;
            }
        }
        System.out.println("Minimum value is : " + min);
        return min;
    }

    public static void sortAscending(int ary[]) {
        int temp;
        for (int i =0; i < ary.length-1; i++){
            for (int j = 0; j<ary.length-1; j++){
                if (ary[j] >ary[j+1]){
                    temp = ary[j+1];
                    ary[j+1] = ary[j];
                    ary[j] = temp;
                }
            }
        }
       String sorted = Arrays.toString(ary);
        System.out.println(sorted);


    }

    public static void sortDescending(int ary[]) {
        int temp1;
        for (int i =0; i < ary.length-1; i++){
            for (int j = 0; j<ary.length-1; j++){
                if (ary[j] <ary[j+1]){
                    temp1 = ary[j+1];
                    ary[j+1] = ary[j];
                    ary[j] = temp1;
                }
            }
        }
        String sorted = Arrays.toString(ary);
        System.out.println(sorted);


    }


    public static void main(String[] args) {
        int[] minV = {10, 2, 30, 9, 50, 8, -3, 40, 7, -60};
        Akhgar.minValue(minV);
        int ary[] ={1,5,9,0,-4,8,-1,3};
        Akhgar. sortAscending(ary);

        Akhgar.sortDescending(ary);
    }


}
