package sorting.problems;

import util.Numbers;

/*
 * Leetcode https://leetcode.com/problems/kth-largest-element-in-an-array/
 * A Selection problem
 *
 * Strategy: "RANDOMIZED QUICK SELECT"
 */
public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int find(int[] A, int start, int end, int k) {
        // base case : Leaf node case
        if (start == end) {
            return A[end];
        }
        // internal node worker : Lomuto's Partition
        int random_index = Numbers.random(start, end);
        Numbers.swap(start, random_index, A);
        int small = start;
        for (int big = start + 1; big <= end; big++) {
            if (A[big] <= A[start]) {
                small++;
                Numbers.swap(small, big, A);
            }
        }
        Numbers.swap(small, start, A);

        if (small == k) {
            return A[small];
        } else if (small < k) {
            return find(A, small + 1, end, k);
        }

        return find(A, start, small - 1, k);

    }
}
