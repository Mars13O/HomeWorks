package natalija.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_sortingASC {

    /*
    ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

/*
    public static void main(String[] args) {
            ArrayList al = new ArrayList();
            al.add("reena");
            al.add("teena");
            al.add("anu");
            al.add("zahir");
            al.add("sonu");
            System.out.println("Unsorted Arraylist:");
            System.out.println(al);
            int count = al.size();
            String temp;
            Object[] name = al.toArray();
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    if (((String) name[i]).compareTo((String) name[j]) > 0) {
                        temp = (String) name[i];
                        name[i] = name[j];
                        name[j] = temp;
                    }
                }
            }
            System.out.println("Sorted Arraylist:");
            for (int a = 0; a < name.length; a++) {
                System.out.println(name[a]);
            }
        }
 */
public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Natalija");
    arrayList.add("Marija");
    arrayList.add("Tom");
    arrayList.add("Petar");
    arrayList.add("Mike");
    arrayList.add("Steven");

    System.out.println("Unsorted arrayList = " + arrayList);

    sortArrayListASC(arrayList);
    System.out.println("Sorted arrayList = " + arrayList);


}

    public static void sortArrayListASC(ArrayList<String> arrayList){

        int count = arrayList.size();

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if(arrayList.get(j).compareTo(arrayList.get(j+1)) > 0){
                    String temporary = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temporary);
                }

            }
        }

    }

}
