package natalija.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        /*
        Write a function:
        that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3, or 5, should be replaced by the word Codility, Test, or Coders respectively. If a number is divisible by more than one of the numbers: 2, 3, or 5, it should be replaced by a concatenation of the respective words Codility, Test, and Coders in this given order.
        numbers divisible by both 2 and 3 - CodilityTest
        numbers divisible by both 2 and 5 - CodilityCoders
        numbers divisible by all, 2, 3, and 5 - CodilityTestCoders
         */

        consecutiveNumbers(24);
        consecutiveNumbers(30);

    }

    public static void consecutiveNumbers(int n){


        for (int i = 1; i <= n; i++){
            String result = "";

            if(i % 2 == 0){
                result += "Codility";
            }

            if(i % 3 == 0){
                result += "Test";
            }

            if(i % 5 == 0){
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? i : result);

        }

    }


}
