package sorting.problems;

import java.util.HashMap;

/*
 * Leetcode https://leetcode.com/problems/two-sum/
 * A Decision problem
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }

            map.put(nums[i],i);
        }
        return result;
    }
}
