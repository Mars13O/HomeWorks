package week5.Ashgarf;

public class AA_Unique_Char {
    /*
    - Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i<str.length(); i++){
            char chr = str.charAt(i);
            if (str.indexOf(chr) == str.lastIndexOf(chr)){
                unique += chr;
            }
        }

        System.out.println(unique);
    }

}
