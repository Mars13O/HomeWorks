package week6;

import javax.swing.*;
import java.util.Scanner;

public class Akhgar {

    public static boolean validPassword() {
        String password;

        Scanner input = new Scanner(System.in);
        password=input.nextLine();
        if (password.length() < 6) {
            System.err.println("Password should be at least 6 character");
            return false;
        } else if (!password.matches(".*[A-Z].*")) {
            System.err.println("Password should at least contain one UpperCase letter");
            return false;
        } else if (!password.matches(".*[a-z].*")) {
            System.err.println("Password should at least contain one LowerCase letter");
            return false;
        } else if (!password.matches(".*\\d.*")) {
            System.err.println("Password should at least contain one digit");
            return false;
        } else if (!password.matches(".*[#@!~`$%^&*()_,.+?:{}|<>=].*")) {
            System.err.println("Password should at least contain one special character.");
            return false;
        }
        System.out.println("Password Accepted");
        return true;

    }


    // ---- sum of digit in String ---
    public static int sumoOfStringDigits(String str){
        int sumOfDigit = 0;
        for(int i =0; i <str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sumOfDigit += Character.getNumericValue(str.charAt(i));
            }

        }
        System.out.println("Sum of the digits in String is: = "+ sumOfDigit);
        return sumOfDigit;
    }

    public static int maxValue(int[] aryValues){

        int max = aryValues[0];
        for (int eachValue : aryValues) {
            if (max < eachValue){
                max = eachValue;
            }
        }
        System.out.println("Maximum value is : "+ max);
        return max;
    }



    public static void main(String[] args) {
       // Akhgar.validPassword();
       // Akhgar.sumoOfStringDigits("4P7ND623E80T5");
        int[] maxV = {10,2,30,9,50,8,3,40,7,60};
        Akhgar.maxValue(maxV);
    }
}
