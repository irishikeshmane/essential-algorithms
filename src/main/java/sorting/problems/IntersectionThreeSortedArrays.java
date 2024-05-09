package sorting.problems;

import java.util.*;

/*
 * Leetcode https://leetcode.com/problems/intersection-of-three-sorted-arrays/
 * A Selection problem
 *
 * Strategy: "Binary Search on larger array"
 * TODO : Need more optimized solution
 */
public class IntersectionThreeSortedArrays {
    static ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        ArrayList<Integer> result = new ArrayList<>();

        int size1 = arr1.size();
        int size2 = arr2.size();
        int size3 = arr3.size();

        int[] big;
        int[] small1;
        int[] small2;

        //HashMap<Integer, Integer> map = new HashMap<>();

        if (size1 >= size2 && size1 >= size3) {
            big = arr1.stream().mapToInt(i -> i).toArray();
            small1 = arr2.stream().mapToInt(i -> i).toArray();
            small2 = arr3.stream().mapToInt(i -> i).toArray();
        } else if (size2 >= size1 && size2 >= size3) {
            big = arr2.stream().mapToInt(i -> i).toArray();
            small1 = arr1.stream().mapToInt(i -> i).toArray();
            small2 = arr3.stream().mapToInt(i -> i).toArray();
        } else {
            big = arr3.stream().mapToInt(i -> i).toArray();
            small1 = arr2.stream().mapToInt(i -> i).toArray();
            small2 = arr1.stream().mapToInt(i -> i).toArray();
        }

        int i = 0, j = 0;
        while (i < small1.length && j < small2.length) {
            if (small1[i] == small2[j]) {
                if (Arrays.binarySearch(big, small1[i]) >= 0) {
                    result.add(small1[i]);
                    i++;
                    j++;
                }
            } else if (small1[i] > small2[j]) {
                j++;
            } else if (small1[i] < small2[j]) {
                i++;
            }
        }

        if (result.isEmpty()){
            result.add(-1);
            return result;
        }
        return result;
    }
}
