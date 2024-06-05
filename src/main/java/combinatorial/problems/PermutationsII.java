package combinatorial.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Leetcode : https://leetcode.com/problems/permutations-ii/
 * Hint : duplicates in problem list but no duplicates in result
 * Space complexity : O(n! * n)
 * Time complexity : O(n! * n)
 * Strategy : repeated numbers at a specific levels should be skipped
 */
public class PermutationsII {

    List<List<Integer>> result;

    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>());
        return result;
    }

    private void helper(int[] nums, int i, List<Integer> slate) {
        // leaf node case
        if (i == nums.length) {
            result.add(new ArrayList<>(slate));
            return;
        }
        // internal node case
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j = i; j < nums.length; j++) {
            if (map.containsKey(nums[j])) {
                continue;
            }else {
                map.put(nums[j],1);
            }
            swap(nums, i, j);
            slate.add(nums[i]);
            helper(nums,i+1,slate);
            slate.remove(slate.size()-1);
            swap(nums, i, j);
        }

    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
