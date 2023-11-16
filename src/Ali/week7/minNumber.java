package Ali.week7;

public class minNumber {

    public static void main(String[] args) {

        int [] Arr = {10, 8, 9, 8, 2, 4};

        System.out.println(minNum(Arr)); // 2

    }



    public static int minNum(int[] arr){

        int min = arr[0]; // assume the first element as min

        for (int each : arr) {

            if(each < min){
                min = each;
            }
            
        }

        return min;
    }





}
