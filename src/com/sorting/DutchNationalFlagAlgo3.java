package src.com.sorting;

public class DutchNationalFlagAlgo3 {
    public static void main(String[] args){
        int[] a = {2,0,1,-1,0,2,1,0,0};
        int low = 0;
        int mid = 0;
        int hight = a.length -1;
        while(mid <= hight){
            switch (a[mid]){
                case 0:
                    swapNumbers(a,low,mid);
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swapNumbers(a,mid,hight);
                    hight--;

                    System.out.println("Sorted Array:Case2");
                    for(int i:a){
                        System.out.print(a[i]);
                    }
                    break;

            }
        }

    }
    static void  swapNumbers(int[] a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;
    }

    private static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
