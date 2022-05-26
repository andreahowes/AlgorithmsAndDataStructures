package NeetCode_2022_Summer.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        Integer[] nums = {3, 4, 2, 1};
        Integer target = 6;
        int[] answer = twosum(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] twosum(Integer[] nums, Integer target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> myhashmap = new HashMap<Integer, Integer>();
        
        for(int x = 0; x<nums.length; x++) {
           //see if answer minus this number is in hashmap 
           if (myhashmap.containsKey(target - nums[x])) {
               answer[0] = myhashmap.get(target - nums[x]);
               answer[1] = x;
               return answer;
           } else { //otherwise add this new number to the hashmap
               myhashmap.put(nums[x], x);
           }
          
        }
        return null;
    }
    
}
