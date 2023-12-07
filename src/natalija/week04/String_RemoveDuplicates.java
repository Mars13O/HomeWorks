package natalija.week04;

public class String_RemoveDuplicates {

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println("removeDuplicates(str) = " + removeDuplicates(str));

    }


    public static String removeDuplicates(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(!result.contains(String.valueOf(str.charAt(i)))){
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }

}
