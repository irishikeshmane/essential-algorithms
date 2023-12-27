package sorting.algorithms;

/*
 * This class is for Insertion Sort ** DECREASE & CONQUER **
 *
 * --------------------------------
 * time complexity = O(n^2)
 * space complexity = O(n)
 * --------------------------------
 * */
public class InsertionSort {

    public static int[] sort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && (A[j] > temp)) {
                A[j + 1] = A[j];
                j--;
            }
            A[j+1] = temp;
        }

        return A;
    }

}
