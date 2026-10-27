package src.com.deloitte;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String name = "srinvas";
        String name1 = "srinivas1";
        char[] name1Arry = name1.toCharArray();
        char[] name2Arry = name.toCharArray();

        Arrays.sort(name1Arry);
        System.out.println(name1Arry);

        Arrays.sort(name2Arry);
        System.out.println(name2Arry);


    }

}
