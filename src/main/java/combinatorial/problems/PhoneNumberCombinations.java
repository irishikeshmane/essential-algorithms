package combinatorial.problems;

/*
 * Leetcode : https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

 * Hint :
 * Space Complexity :
 * Time Complexity :
 * Strategy :
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO
public class PhoneNumberCombinations {
    private List<String> result;
    private final Map<Character, char[]> map;

    public PhoneNumberCombinations() {
        map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if (digits.isBlank()) {
            return result;
        }
        helper(digits,0,new StringBuilder());
        return result;
    }

    private void helper(String digits, int i, StringBuilder slate) {
        // back-tracking
        if (slate.length() == digits.length()) {
            result.add(slate.toString());
            return;
        }
        // internal node case
        char[] arr = map.get(digits.charAt(i));
        for (char c : arr) {
            slate.append(c);
            helper(digits, i + 1, slate);
            slate.deleteCharAt(slate.length() - 1);
        }
    }
}
