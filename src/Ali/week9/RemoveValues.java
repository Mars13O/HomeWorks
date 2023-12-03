package Ali.week9;

//ArrayList - Remove some values
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveValues {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1005, 50, 89, 120, 78, 205, 300));
        System.out.println(removeMoreThan100(nums));

    }




    public static List<Integer> removeMoreThan100(List<Integer> nums){

        Iterator<Integer> iterator =nums.iterator();

        while (iterator.hasNext()){

            if(iterator.next() > 100){
                iterator.remove();
            }
        }
        return nums;
    }
}
