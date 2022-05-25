package NeetCode_2022_Summer.ArraysAndHashing;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        Integer[] nums = {};
        Integer target = 6;
        int[] answer = twosum(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] twosum(Integer[] nums, Integer target) {
        int[] answer = new int[2];

        for(int x = 0; x<nums.length; x++) {
            for(int p = x+1; p<nums.length; p++){
                System.out.println(p);
                System.out.println(x);
                if((nums[x] + nums[p]) == target) {
                    answer[0] = x;
                    answer[1] = p;
                    return answer;
                } 
            }
          
        }
        return null;
    }
    
}
