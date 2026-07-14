package src.com.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort1 {
   public static void main(String[] args){
       int[] arr = {5,2,1,4,0,6,3};
       int minimumIndex = 0;
       for(int i=0;i<arr.length-1;i++){
           minimumIndex = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[minimumIndex]){
                minimumIndex = j;
            }
        }
        int temp = arr[minimumIndex];
        arr[minimumIndex] = arr[i];
        arr[i] = temp;
       }
       System.out.println(Arrays.toString(arr));
   }

}
