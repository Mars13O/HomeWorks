package natalija.week6;

public class String_PasswordValidation {

    /*
    String -- Password Validation Task
    Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
     */

    public static void main(String[] args) {

        String password ="NaT3456&oij";

        String pass = "Natt93";

        System.out.println("PasswordValidation(password) = " + PasswordValidation(password));

        System.out.println("PasswordValidation(pass) = " + PasswordValidation(pass));

    }

    public static boolean PasswordValidation(String password){


        if(password.length() < 6 || password.contains(" ")){
            return false;
        }

        boolean moreThan6 = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
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

        boolean isValidPassword = moreThan6 && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if(isValidPassword){
            System.out.println("true" );
        }else {
            System.out.println("false");
        }

        return isValidPassword;

    }

}
