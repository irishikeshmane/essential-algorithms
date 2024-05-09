package sorting.problems;

/*
 * Leetcode https://leetcode.com/problems/merge-sorted-array/
 *
 *
 * Strategy: "MERGE SORT"
 * TODO : Need more optimized solution
 */
public class MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        // corner case
        if (n == 0) {
            return;
        }
        int temp;
        for (int i = 0; i < n; i++) {
            temp = nums2[i];
            int j = m;
            nums1[m] = temp;
            while (nums1[j - 1] > nums1[j]) {
                nums1[j] = nums1[j - 1];
                j--;
            }
            nums1[j] = temp;
            m++;
        }
    }
}
