package src.com.logical;

import java.util.ArrayList;
import java.util.List;

public class SortKeysInList {
    public static void main(String args[]) {
        List<String> arr = new ArrayList<String>();
        arr.add("Hyderabad");
        arr.add("Bangalore");
        arr.add("Chennai");
        arr.add("Kolkata");
        arr.add("Mumbai");
        arr.add("Agartala");

        arr.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println(arr);;
        arr.sort((String s1,String s2)->s2.compareTo(s1));
        System.out.println(arr);;
    }
}