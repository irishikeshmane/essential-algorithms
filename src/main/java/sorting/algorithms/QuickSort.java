package sorting.algorithms;

import util.Numbers;
import util.QuickSortStrategy;

/*
 * This class is for Quick Sort
 *
 * --------------------------------
 * time complexity = O(n Log n)
 * space complexity = O(1)
 * --------------------------------
 * */
public class QuickSort {

    public static int[] sort(int[] A) {
        sort(A, 0, A.length - 1, QuickSortStrategy.LOMUTO);
        return A;
    }

    public static int[] sort(int[] A, QuickSortStrategy strategy) {
        sort(A, 0, A.length - 1, strategy);
        return A;
    }

    private static void sort(int[] A, int start, int end, QuickSortStrategy strategy) {
        // leaf node case
        if (start >= end) {
            return;
        }

        // internal node case
        // randomization
        int pivot = Numbers.random(start, end);
        Numbers.swap(start, pivot, A);

        // divide and conquer
        int mid;
        if (strategy.equals(QuickSortStrategy.LOMUTO)) {
            mid = partitionByLomuto(A, start, end);
        } else {
            mid = partitionByHoare(A, start, end);
        }

        sort(A, start, mid - 1, strategy);
        sort(A, mid + 1, end, strategy);

    }

    private static int partitionByLomuto(int[] A, int start, int end) {
        int small = start;
        for (int big = start + 1; big <= end; big++) {
            if (A[big] <= A[start]) {
                small++;
                Numbers.swap(small, big, A);
            }
        }
        Numbers.swap(small, start, A);
        return small;
    }

    private static int partitionByHoare(int[] A, int start, int end) {
        int small = start + 1;
        int big = end;
        while (small <= big) {
            if (A[small] <= A[start]) {
                small++;
            } else if (A[big] > A[start]) {
                big--;
            } else {
                Numbers.swap(small, big, A);
                small++;
                big--;
            }
        }
        Numbers.swap(start, big, A);
        return big;
    }
}
