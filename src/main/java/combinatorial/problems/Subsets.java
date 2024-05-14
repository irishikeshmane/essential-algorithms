package combinatorial.problems;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode : https://leetcode.com/problems/subsets/description/
 * space complexity : O(2^n)
 * time complexity : O(2^n)
 *  */
public class Subsets {
    List<List<Integer>> result;

    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>());
        return result;
    }

    void helper(int[] nums, int i, List<Integer> slate) {
        // leaf node case
        if (i == nums.length) {
            result.add(new ArrayList<>(slate));
            return;
        }

        // internal node case

        // exclude case
        helper(nums, i + 1, slate);

        // include case
        slate.add(nums[i]);
        helper(nums, i + 1, slate);
        slate.remove(slate.size() - 1);

    }
}
