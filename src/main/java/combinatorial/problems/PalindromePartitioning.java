package combinatorial.problems;


import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode : https://leetcode.com/problems/palindrome-partitioning/description/

 * Hint : back tracking
 * Space Complexity : n^2
 * Time Complexity : n^3
 * Strategy :
 */
public class PalindromePartitioning {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        if (s.isEmpty()) {
            return result;
        }
        helper(s, 0, new ArrayList<String>());
        return result;
    }
    private void helper(String s, int i, List<String> slate) {
        // leaf node case
        if (i == s.length()) {
            result.add(new ArrayList<>(slate));
            return;
        }
        // internal node case
        for (int k = i; k < s.length(); k++) {
            if (isPalindrome(s, i, k)) {
                slate.add(s.substring(i, k + 1));
                helper(s, k + 1, slate);
                slate.remove(slate.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int i, int k) {
        while (i <= k) {
            if (s.charAt(i) != s.charAt(k)) {
                return false;
            }
            i++;
            k--;
        }
        return true;
    }
}
