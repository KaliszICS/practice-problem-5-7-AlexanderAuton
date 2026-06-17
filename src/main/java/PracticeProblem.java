/**
	* File: Lesson 5.7 - arrayLists
	* Author: Auton
	* Date Created: May 06, 2026
	* Date Last Modified: Jun 16, 2026
*/	
import java.util.ArrayList;

public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static void swap(ArrayList<String> arr, int index1, int index2) {
        String temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    public static ArrayList<Double> createArrayList(double[] arr) {
        ArrayList<Double> list = new ArrayList<Double>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        return list;
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < list1.size(); i++) {
            newList.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            newList.add(list2.get(i));
        }

        return newList;
    }
}
