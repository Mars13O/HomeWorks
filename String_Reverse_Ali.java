public class String_Reverse_Ali {

    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse(String str) {

        String reverse = "";// to contain all the characters of the given string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // +=: to get each characters of the string starting from last index to index 0
        }

        return reverse;
    }


    public static void main(String[] args) {

        System.out.println(reverse("alfer"));
    }





    /*
     we want to be able to get the data which has reverse version. therefore, we create a varialbe
               String reverse= "";  and whatever the data we got it should be added to this reverse. therefore:
               reverse += str.charAt(i)  // avaJ
               problem here is: we want a code that can use many times. what if user give more that 4 digit? what i is going to be?
               how do we find the last index number in that case? therefore:
               for (int i =str.length()-1; i>= 0; i--)

               so i = whatever string "" has putten here, calculate the lenght first and then minus 1 to get the last index number

               so we can reverse any string that has given to us using this code: starting from last index to index 0. that's the logic
     */


}
