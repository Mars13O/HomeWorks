package Homework_Ali.week6;

public class String_Password_Validation {

     /*
    1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
     */

    public static void main(String[] args) {

        isPasswordValid("Alfer216! ");

    }


    public static void isPasswordValid(String password){

        if(password.contains(" ")){
            System.out.println("Invalid password! ");
            return;
        }

        boolean hasAtLeast6Chars = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for(int i = 0; i < password.length(); i++){ // i = index number of password
            char ch = password.charAt(i); // get us each character of the password
            if(Character.isUpperCase(ch)){ // Character rapper class
                hasUpperCase=true;

            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;

            }else if (Character.isDigit(ch)){
                hasDigit=true;
            }else{
                hasSpecialChar = true;
            }
        }

        boolean isValidPassword = hasAtLeast6Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if(isValidPassword){
            System.out.println("true" );
        }else {
            System.out.println("false");
        }

    }


}
