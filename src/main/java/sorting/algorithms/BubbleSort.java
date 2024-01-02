package sorting.algorithms;

import util.Numbers;

/*
 * This class is for Bubble Sort
 *
 * --------------------------------
 * time complexity = O(n^2)
 * space complexity = O(1)
 * --------------------------------
 * */
public class BubbleSort {
    public static int [] sort(int [] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {
                if (A[j] < A[j-1]) {
                    Numbers.swap(j,j-1,A);
                }
            }
        }
        return A;
    }
}
