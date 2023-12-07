package natalija.week02;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        /*
        Write a program that can print the numbers between 1~100 that can be divisible by 3, 5, and 15.

        if divisible by 3, 5, and 15 -> DivisibleBy15' section
        if divisible by 3 -> DivisibleBy3' section
        if divisible by 5 -> DivisibleBy5' section
         */

        int n = 100;
        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for(int i = 1; i <= n; i++){

            if(i % 15 == 0){
                divisibleBy15 += i + " ";
            }else if(i % 3 == 0){
                divisibleBy3 += i + " ";
            }else if(i % 5 == 0){
                divisibleBy5 += i + " ";
            }

        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);


    }
}
