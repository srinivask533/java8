package src.com.deloitte;

import java.util.HashMap;
import java.util.Map;

public class SumTarger {
    public static void main(String[] args){
        int[] nums =  {2, 7, 11, 15};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int pair = target - nums[i];
            if (map.containsKey(pair)) {
               System.out.println(pair+"  "+nums[i] );
            }
            map.put(nums[i],pair);
        }


    }
}
