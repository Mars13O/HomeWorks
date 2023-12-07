package natalija.week02;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        /*
        Swap two variable' values without using a third variable
         */

        int n1 = 7;
        int n2 = 9;

        n1 = n1 + n2; // 7 + 9 = 16

        n2 = n1 - n2; // 16 - 9 = 7
        n1= n1 - n2; // 16 - 7 = 9

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);


    }
}
