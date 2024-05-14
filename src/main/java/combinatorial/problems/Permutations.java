package combinatorial.problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
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
        for (int j = i; j < nums.length; j++) {
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
