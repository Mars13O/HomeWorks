package week6;

import java.util.Scanner;

public class Ilona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        input.close();
        boolean GoodPassword  = true;
        boolean Incorect = false;

        if (password.isEmpty()) {
            System.out.println(false);
        }
        char Charpassword = password.charAt(0);

        for (int i = 0; i < password.length(); i++) {
            if (password.length() > 6) {
                if (Character.isUpperCase(password.charAt(i)) || Character.isLowerCase(password.charAt(i)) || Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)) || !Character.isLetterOrDigit(password.charAt(i))) {


                }

               GoodPassword =true;
            } else {
               GoodPassword =false;
            }


        }
        System.out.println(GoodPassword);






    }
}
