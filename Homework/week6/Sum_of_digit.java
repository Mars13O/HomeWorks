package Homework.week6;

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

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                sum += Integer.parseInt("" +ch); // now we have the integer value of that character and added to sum
            }
        }

        System.out.println(sum);
        return sum;
    }

}
