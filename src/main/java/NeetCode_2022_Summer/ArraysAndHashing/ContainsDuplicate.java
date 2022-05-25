package NeetCode_2022_Summer.ArraysAndHashing;

import java.util.HashMap;

public class ContainsDuplicate {

    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static void main (String[] args) {
        int[] nums = {1,2,3, 1};
        boolean result = containsDups(nums);
        System.out.println(result);

    }

    private static boolean containsDups(int[] nums) {
        //create a hashmap and increment for each time a key exists
        //then read the hashmap and if it has anything over 1, return false
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        boolean finalResult = false;
        for (int i : nums) {
            if(hmap.containsKey(i)){
                hmap.put(i, hmap.get(i) + 1);
            } else {
                hmap.put(i, 1);
            }
        }
        for (Integer key : hmap.keySet()) {
            if(hmap.get(key)>1){
                finalResult = true;
            }
        }
        return finalResult;
    }
    
}
