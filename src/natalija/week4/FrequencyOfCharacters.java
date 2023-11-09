package natalija.week4;

public class FrequencyOfCharacters {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));

        System.out.println("frequencyOfCharacters(\"NATALIJA\") = " + frequencyOfCharacters("NATALIJA"));
    }

    public static String frequencyOfCharacters(String str){

        String result = "";

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++){

                char each = str.charAt(j);
                if(ch == each){
                    count++;
                }
            }

            if(result.contains("" + ch)){
                continue;
            }

            result += ch;
            result += count;

        }

       return result;

    }

}
