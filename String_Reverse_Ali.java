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



}
