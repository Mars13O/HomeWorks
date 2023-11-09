package Homework_Ali.week6;

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */

public class Sum_of_digit {

    public static void main(String[] args) {

        sumOfDigitsInString("al125fer12");

    }

    public static int sumOfDigitsInString(String str) {

        int sum = 0;

        for(int i = 0; i < str.length(); i++){ // i= index number of string
            char ch = str.charAt(i); // get each character of string

            if(Character.isDigit(ch)){ // Character wrapper class
                sum += Integer.parseInt("" +ch); // we need to convert char into int, by using Integer wrapper class and using parseInt method. now we have the integer value of that character and added to sum
            }
        }

        System.out.println(sum);
        return sum;
    }

}
