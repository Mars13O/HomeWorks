package Optional_Java_Coding_Tasks;

public class Ilona_Obolenska {
    public static void main(String[] args) {
        //1 -->Write a method that can check if a number is an Armstrong number
        //Armstrong number -  is a number that's digits can bw raised to the power of the total number of digits and summed to equal to the original number

        int  number = 153;
        String strNum = ""+number;
        int sizeOfTheNumber = (""+number).length();
        int sum = 0;
        for (int i = 0; i < sizeOfTheNumber; i++) {
            int EachDigit = Integer.parseInt(""+strNum.charAt(i));
            sum += Math.pow(EachDigit,sizeOfTheNumber);
        }
        if(sum == number){
            System.out.println("the number is Amstrong");
        }else {
            System.out.println("the number is not Amstrong");
        }



        //2
    }
}
