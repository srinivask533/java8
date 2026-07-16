package src.com.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args){
        int[] a = {45,78,23,6,-8,89,12};
        int minIndex = 0;
        for(int i=0; i<a.length;i++){
            minIndex = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }

            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
