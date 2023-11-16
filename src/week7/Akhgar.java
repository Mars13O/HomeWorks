package week7;

public class Akhgar {

    public static int minValue(int[] aryValues){

        int min = aryValues[0];
        for (int eachValue : aryValues) {
            if (min > eachValue){
                min = eachValue;
            }
        }
        System.out.println("Minimum value is : "+ min);
        return min;
    }



    public static void main(String[] args) {
        int[] minV = {10,2,30,9,50,8,-3,40,7,-60};
        Akhgar.minValue(minV);
    }


}
