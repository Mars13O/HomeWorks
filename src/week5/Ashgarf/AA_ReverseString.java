package week5.Ashgarf;

public class AA_ReverseString {

    /*
    Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {

        String str = "ABCD";    // the string that we need to reverse
        String reverseStr = ""; // a new string that we could assigned the reversed Str

        for (int i = str.length()-1; i>=0;i--){  // in the loop it will iterate starting fom last index of the given string and will stop the loop when "i" is 0, (there is no more character left)

            reverseStr += str.charAt(i);  // concatenate and assigned to the reverseStr variable
        }
        System.out.println(reverseStr);  // print the result.


        //Second way
        String str2 = "this is my string";
        String restr = "";
        for (int i =0; i<str2.length(); i++ ){
            char ch = str2.charAt(i);
            restr = ch + restr;
        }
        System.out.println(restr);
    }

}
