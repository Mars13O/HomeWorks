package natalija.week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*
    Map-- Frequency of Characters
    Write a method that prints the frequency of each character from a String.
     */

    public static void main(String[] args) {

        String str = "Natalija";
        String str1 = "Rakovich";

        frequencyOfChar(str);
        frequencyOfChar(str1);
    }

    public static void frequencyOfChar(String str){

        Map<Character, Integer> countChar = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){

            char eachChar = str.charAt(i);

            if(!countChar.containsKey(eachChar)){
                countChar.put(eachChar, 0);
            }

            countChar.put(eachChar, countChar.get(eachChar) + 1);

        }

        System.out.println(countChar);

    }

}
