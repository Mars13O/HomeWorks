package week5;

import java.util.ArrayList;
//#2
public class Ilona {
    public static void main(String[] args) {
       String str = "ABCD";
       String reverseSTR = "";
        for (int i = str.length() - 1; i >= 0; i--) {
     reverseSTR += str. charAt(i);
        }
        System.out.println(reverseSTR);
        //



    }
}
