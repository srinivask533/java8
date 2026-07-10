package src.com.datastructures.sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,2,1,4,0,6,3};
        for(int i=0;i< arr.length-1;i++){
            int minIndex =i;

            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;

                }
                int temp = arr[minIndex];
                arr[minIndex] =  arr[i];
                arr[i]=temp;

            }

        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
