package natalija.week01;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {

        /*
        int dividend = 20;
        int divisor = 4;

        System.out.println("Dividing without using division operator: " + (dividend * (0.25)));
         */

        divide(10,4);
        divide(13,4);
        divide(12,2);
        divide(22,0);
    }

    public static void divide(int num1, int num2){

        if(num2 == 0){
            System.out.println("Can not divide by zero");
            return;
        }

        int count = 0;
        String result = num1 + " / " + num2 + " is ";

        while(num1 >= num2){
            count++;
            num1 -= num2;
        }

        System.out.println(result + count + " with remainder " + num1);
    }





}
/*
Write a method that can divide two numbers without using division operator
 */