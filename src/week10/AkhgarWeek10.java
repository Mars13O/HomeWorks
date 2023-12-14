package week10;

import week7.Akhgar;

import java.util.*;

public class AkhgarWeek10 {
    /*
1)ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.
2)ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
3)Map - Sort the map by values
Write a method that can sort the Map by values
     */

    //1)ArrayList - sorting in ascending
    //Write a method that can sort the ArrayList in Ascending order without using the sort method.
    public static void sortAscending(ArrayList<Integer> list) {
        int n =list.size();
        int temp;
        for (int i =0; i < n-1; i++){
            for (int j = 0; j < n-1; j++){
                if (list.get(j) > list.get(j+1)){
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }


    }

    //2)ArrayList - sorting in descending order
    //Write a method that can sort the ArrayList in descending order without
    //using the sort method.
    public static void sortDescending(ArrayList<Integer> list) {
        int n =list.size();
        int temp;
        for (int i =0; i < n-1; i++){
            for (int j = 0; j < n-1; j++){
                if (list.get(j) < list.get(j+1)){
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }

    }


    //3)Map - Sort the map by values
    //Write a method that can sort the Map by values

    public static <K,V extends Comparable<?super V>>Map<K,V> sortByValues (Map<K,V> map){

        List<Map.Entry<K,V>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
        Map<K,V>sortedMap = new LinkedHashMap<>();

        for (Map.Entry<K,V> entry:entries){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,9,0,-4,8,-1,3));
        System.out.println("numbers before sorting = " + numbers);

        System.out.println("========ArrayList Ascending=========");
        AkhgarWeek10.sortAscending(numbers);
        System.out.println("numbers after sorting Ace = " + numbers);

        System.out.println("========ArrayList Descending=========");
        AkhgarWeek10.sortDescending(numbers);
        System.out.println("numbers after sorting Dec= " + numbers);

        System.out.println("========Map Sort By Value=========");

        Map<String,Integer> thisMap = new HashMap<>();
        thisMap.put("Car",4);
        thisMap.put("Bar",9);
        thisMap.put("Jar",7);
        thisMap.put("Tar",1);
        thisMap.put("Far",6);

        System.out.println(AkhgarWeek10.sortByValues(thisMap));

    }
}
