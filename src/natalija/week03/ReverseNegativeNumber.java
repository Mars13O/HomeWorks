package natalija.week03;

public class ReverseNegativeNumber {

    /*
    2. Numbers -- Reverse negative number
    Write a return method that can reverse
    negative number and return it as int
     */

        public static void main(String[] args) {

            System.out.println(reverseNegativeNumber2(-137));
        }


    public static int reverseNegativeNumber2(int num){

        if(num > 0){
            System.out.println("This is not a negative number");
        }


        int reverse = 0;
        while(num!= 0){

            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;


        }

        return reverse;
    }


    public static int reverseNegativeNumber(int num){

        String str = new StringBuilder("" + num).reverse().toString();
        if(num < 0){
            str= "-" + str.substring(0,str.length()-1);
        }
        return Integer.valueOf(str);
    }


}