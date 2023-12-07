package natalija.week10;

import java.util.ArrayList;

public class ArrayList_sortingDESC {

    /*
    ArrayList - sorting in descending order
    Write a method that can sort the ArrayList in descending order without using the sort method.
     */


    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Natalija");
        arrList.add("Marija");
        arrList.add("Tom");
        arrList.add("Petar");
        arrList.add("Mike");
        arrList.add("Steven");

        System.out.println("Unsorted arrList = " + arrList);

        sortArrayListDESC(arrList);
        System.out.println("Sorted arrList = " + arrList);


    }

    public static void sortArrayListDESC(ArrayList<String> arrList){

        int count = arrList.size();

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if(arrList.get(j).compareTo(arrList.get(j+1)) < 0){
                    String temporary = arrList.get(j);
                    arrList.set(j, arrList.get(j + 1));
                    arrList.set(j + 1, temporary);
                }

            }
        }

    }

}
