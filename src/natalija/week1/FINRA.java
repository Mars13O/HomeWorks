package natalija.week1;

public class FINRA {
    public static void main(String[] args) {

        finra(30);


    }

    public static void finra(int num){

        for (int i = 1; i <= num; i++ ){

            if(i % 15 == 0){
                System.out.println("first.FINRA ");
            }else if(i % 5 == 0){
                System.out.println("RA ");
            }else if(i % 3 == 0){
                System.out.println("FIN ");
            }else{
                System.out.println(i + " ");
            }

        }

    }
}
/*
Write a method which prints out the number from 1 to 30 but for numbers which are a multiple of 3 print "FIN" instead of the number and for numbers that are a multiple of 5 print "RA" instead of the number. for numbers which are a multiple of both 3 and 5 print "first.FINRA" instead of the number
 */
