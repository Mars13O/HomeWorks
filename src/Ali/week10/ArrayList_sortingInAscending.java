package Ali.week10;

import java.util.ArrayList;

public class ArrayList_sortingInAscending {

    /*
    ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Melex");
        arrayList.add(" Delex");
        arrayList.add("Pelex");


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
