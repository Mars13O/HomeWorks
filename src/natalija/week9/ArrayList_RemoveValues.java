package natalija.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_RemoveValues {

    /*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1234, 123, 12, 13, 35, 356, 56));

        System.out.println(removeGraterThan100(numbers));

    }

    public static List<Integer> removeGraterThan100(List<Integer> numbers){

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){

            if(iterator.next() > 100){
                iterator.remove();
            }
        }
        return numbers;
    }

}
