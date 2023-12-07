package natalija.week06;

public class SumOfDigitsInAString {

  /*
    String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */

    public static void main(String[] args) {

        String str = "H5gg7G8j*g53";

        int result= sumOfDigitsString(str);

        System.out.println("result = " + result);
    }

    public static int sumOfDigitsString(String str){

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Integer.parseInt("" + ch);
            }
        }

        return sum;

    }

}
