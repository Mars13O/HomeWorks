package week10;

import java.util.ArrayList;

public class arrayListSortingDescAC {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(20);
        nums.add(15);
        nums.add(25);
        nums.add(5);
        System.out.println("nums = " + nums);

        arrSort(nums); // after sorting by creating a method below "arrSort"

        System.out.println("nums = " + nums);
    }

    private static void arrSort(ArrayList<Integer> arr){

        int num = arr.size();

        for (int i = 0; i < num-1 ; i++) {
            for (int j = 0; j < num-i-1 ; j++) {
                if (arr.get(j) < arr.get(j+1)){ // here we did same steps like Asc t change to "<" to get Desc

                    // swapping [j] and arr[j+1]
                    int z = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, z);
                }

            }

        }
    }
}
