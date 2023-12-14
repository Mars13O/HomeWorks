package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AkhgarWeek09 {

    /*
    1) Array - Concat two arrays
Write a return method that can concate two arrays
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */

    public static void main(String[] args) {

        System.out.println("=======Removed Name========");
        List<String> students = new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Muhtar","Asiya"));
        System.out.println(AkhgarWeek09.removeStudent(students));

        System.out.println("=======Concat Arrays========");
        String[] a = {"A","B","C"};
        String[] b = {"D","E","F"};
        System.out.println(Arrays.toString(AkhgarWeek09.concatArrays(a, b)));

        System.out.println("=======Removed > 100========");
        List<Integer> values = new ArrayList<>(Arrays.asList(1,111,66,20,201,10,70,99,404));

        System.out.println(AkhgarWeek09.noValueOver100(values));


    }

    //2) ArrayList - Remove "Ahmed"
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    public static List<String> removeStudent(List<String> student){

        student.removeIf(p -> p.equals("Ahmed"));
        return student;
    }

    //1) Array - Concat two arrays
    //Write a return method that can concate two arrays
    public static String[] concatArrays(String[] ary1, String[] ary2){
        String[] twoArrays = new String[ary1.length + ary2.length];

        for (int i =0, j =0; i < twoArrays.length; i++){
            if (i <ary1.length){
                twoArrays[i] = ary1[i];
            }else {
                twoArrays[i] = ary2[j++];
            }
        }
        return twoArrays;
    }

    //3) ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
    public static List<Integer> noValueOver100(List<Integer> nums){
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()){
            if (iter.next() > 100){
                iter.remove();
            }
        }

        return nums;
    }

}
