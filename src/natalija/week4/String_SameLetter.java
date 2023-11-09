package natalija.week4;

import java.util.Arrays;

public class String_SameLetter {

    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

        System.out.println("sameChars(str1, str2) = " + sameChars(str1, str2));

    }

    public static boolean sameChars(String str1, String str2){

        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);

    }

}
