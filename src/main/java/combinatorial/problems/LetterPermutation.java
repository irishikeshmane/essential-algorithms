package combinatorial.problems;

import java.util.ArrayList;
import java.util.List;

/*
* Leetcode : https://leetcode.com/problems/letter-case-permutation/description/
* space complexity : O(2^n)
* time complexity : O(2^n)
*  */

public class LetterPermutation {

    List<String> result;

    public List<String> letterCasePermutation(String s) {
        result = new ArrayList<>();
        helper(s, 0, new StringBuilder());
        return result;
    }

    private void helper(String s, int i, StringBuilder slate) {
        // base case
        if (i == s.length()) {
            result.add(slate.toString());
            return;
        }

        // internal node case
        if (Character.isLetter(s.charAt(i))) {
            helper(s, i + 1, slate.append(Character.toLowerCase(s.charAt(i))));
            slate.deleteCharAt(i);
            helper(s, i + 1, slate.append(Character.toUpperCase(s.charAt(i))));
            slate.deleteCharAt(i);
        } else {
            helper(s, i + 1, slate.append(s.charAt(i)));
            slate.deleteCharAt(i);
        }
    }
}
