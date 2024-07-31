package combinatorial.problems;

import java.util.ArrayList;
import java.util.List;

/*
* Leetcode : https://leetcode.com/problems/combinations/description/
*
* Hint :
* Space complexity :
* Time Complexity :
* Strategy :
* */
public class CombinationBackTracking {

    private List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        helper(n, k, 1, new ArrayList<Integer>());
        return result;
    }

    private void helper(int n, int k, int i, ArrayList<Integer> slate) {
        // back-tracking
        if (slate.size() == k) {
            result.add(new ArrayList<>(slate));
            return;
        }
        // leaf node case
        if (i > n) {
            return;
        }
        // internal node case
        // exclude
        helper(n,k,i+1,slate);
        // include
        slate.add(i);
        helper(n,k,i+1,slate);
        slate.remove(slate.size()-1);
    }
}
