package src.com.sorting;

public class DutchNationalFlagAlgo2 {
    public static void main(String[] args){
        int[] arr = {2,1,0,1,2,0,2,1,0};
        int mid = 0;
        int hight = arr.length-1;
        int low = 0;
        while(mid <= hight) {
            switch (arr[mid]){
                case 0:
                    swapLowAndMidElements(arr,low,mid);
                    low++;
                    mid++;
                    System.out.println("Sorted Array: Case1");
                    printArray(arr);
                    break;
                case 1:
                    mid++;
                    System.out.println("Sorted Array:Case2");
                    printArray(arr);
                    break;
                case 2:
                    swapMidAndHighElements(arr,mid,hight);
                    hight--;
                    System.out.println("Sorted Array:Case2");
                    printArray(arr);
                    break;
            }
        }

        System.out.println("Sorted Array:");
       // printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    private static void swapLowAndMidElements(int[] arr,int low,int mid) {
        int temp = arr[low];
         arr[low] = arr[mid];
        arr[mid] = temp;

    }
    private static void swapMidAndHighElements(int[] arr,int mid,int hight) {
        int temp = arr[hight];
        arr[hight] = arr[mid];
        arr[mid] = temp;
    }
}
