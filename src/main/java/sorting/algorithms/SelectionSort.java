package sorting.algorithms;

/*
* This class is for Selection Sort
*
* --------------------------------
* time complexity = O(n^2)
* space complexity = O(n)
* --------------------------------
* */

import util.Numbers;

public class SelectionSort {

    public static int[] sort(int [] A ) {

        for (int i = 0; i < A.length - 1; i++) {
            int min = A[i];
            int min_index = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < min) {
                    min = A[j];
                    min_index = j;
                }
            }
            Numbers.swap(i,min_index,A);
        }

        return A;
    }

}