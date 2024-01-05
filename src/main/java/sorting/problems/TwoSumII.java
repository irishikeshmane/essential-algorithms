package sorting.problems;

/*
 * Leetcode https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * A Decision problem
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        // two pointer pass approach
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}
