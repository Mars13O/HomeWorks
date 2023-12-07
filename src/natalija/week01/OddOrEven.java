package natalija.week01;

public class OddOrEven {
    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(12);


    }

    public static void oddOrEven(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
    }
}
/*
Write a method which can identifies given number is even or odd
 */