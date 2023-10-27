package week5.Ashgarf;

public class AA_ReverseString {

    /*
    Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {

        String str = "ABCD";
        String reverseStr = "";

        for (int i = str.length()-1; i>=0;i--){
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
    }

}
