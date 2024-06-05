package combinatorial.problems;

/*
 * Leetcode : https://leetcode.com/problems/subsets-ii/description/
 * Hint : duplicates in problem list but no duplicates in result
 * Space complexity :
 * Time complexity :
 * Strategy :
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // sort the input
        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<Integer>());
        return result;
    }

    private void helper(int[] nums, int index, List<Integer> slate) {
        // leaf node case
        if (index == nums.length) {
            result.add(new ArrayList<>(slate));
            return;
        }
        // internal node case
        // get the duplicate count
        int i = index;
        int count = 0;
        while ((i < nums.length) && nums[index] == nums[i]) {
            count++;
            i++;
        }
        // exclude
        helper(nums, index + count, slate);
        // include - multiway
        for (int k = 0; k < count; k++) {
            slate.add(nums[index]);
            helper(nums, index + count, slate);
        }
        for (int k = 0; k < count; k++) {
            slate.remove(slate.size() - 1);
        }
    }
}
