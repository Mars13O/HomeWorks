package week5.Ashgarf;

public class AA_Unique_Char {
    /*
    - Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";

        String unique = ""; // the unique char will be assigned to this string

        for (int i = 0; i<str.length(); i++){ // the loop will check for index 0 to the last index
            char chr = str.charAt(i); // will assign each char to the chr variable.
            if (str.indexOf(chr) == str.lastIndexOf(chr)){ // check it the 1st index char is == to last index char?
                unique += chr;  // then concatenate the char to "chr" variable
            }
        }

        System.out.println(unique);
    }

}
