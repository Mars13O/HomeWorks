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

        System.out.println("__________________________________________");

String str2 =" AAAABBBCCCDEF";
String UniqueString = "";
int count = 0;
ArrayList<String> listSTR = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> uniqueList = new ArrayList<>();
        listSTR.add(str2);
        for (int i = 0; i <str2.length() ; i++) {
           list.add(""+str2.charAt(i));

           if(listSTR.contains(list)){
             count ++;
             for (String each: listSTR ){
                 if(count==1){
                     uniqueList.add(each);
                 }
           }
        }

        }

        System.out.println(uniqueList);




    }
}
