package natalija.week6;

public class Array_FindMaximum {

    public static void main(String[] args) {
        int[] array = {6, 13, -2, -9, 0};
        System.out.println("maxNum(array) = " + maxNum(array));
    }


    public static int maxNum(int[] array){

        int max = array[0];

        for (int each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;


    }

}
