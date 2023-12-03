package Ali.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//ArrayList - Remove "Ahmed"
//Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//Write a java operation to remove all the names named Ahmed

public class Remove_Ahmed {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Mehmet", "Natalija", "Ahmed"));
        System.out.println(removeAhmed(names));
    }




    public static List<String> removeAhmed(List<String> names){

        Iterator<String> iterator = names.iterator(); //Iterator is an interface,The iterator() method is a part of the List interface, and it returns an iterator that can be used to traverse through the elements of the list.


        while(iterator.hasNext()){ // checks if there are elements to through, if yes==>

            if(iterator.next().equals("Ahmed")){ // next()==> move through the elements and returns the value
                iterator.remove();
            }
        }
        return names;
    }


}
