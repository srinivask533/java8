package src.com.internet;

import java.util.Arrays;

public class SlidingWindowAlo {
    public static void main(String[] args){
        int[] a = {1,3,5};
        int k = 3;
        int sum = 0;
        int[] result =  new int[a.length];
        for(int i=0;i<a.length;i++){
           sum = sum +a[i];
           if(i>=k){
               sum -= a[i-k];
           }
           result[i] = sum;
           //System.out.println(sum);
        }
        System.out.println(Arrays.toString(result));
    }

}
