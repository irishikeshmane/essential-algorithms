package sorting.problems;

import sorting.algorithms.QuickSort;

import java.util.*;

/*
 * Leetcode https://leetcode.com/problems/3sum/description/
 *
 */
public class ThreeSum {
    static Set<List<Integer>> result;
    static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map;
        List<Integer> list;
        result = new HashSet<>();
        QuickSort.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (map.containsKey(target - nums[j])) {
                    list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[map.get(target - nums[j])]);
                    list.add(nums[j]);
                    result.add(list);
                } else {
                    map.put(nums[j], j);
                }
            }
        }
        return result.stream().toList();
    }
}
