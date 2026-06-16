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
                    swapElements(arr,low,mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swapElements(arr,mid,hight);
                    hight--;
                    mid++;
                    break;
            }
        }
        for(int i : arr)
            System.out.println(arr[i]);

    }

    private static void swapElements(int[] arr,int low,int mid) {
        int temp = arr[low];
         arr[low] = arr[mid];
        arr[mid] = temp;
    }
}
