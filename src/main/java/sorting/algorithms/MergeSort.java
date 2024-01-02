package sorting.algorithms;
/*
 * This class is for Merge Sort
 *
 * --------------------------------
 * time complexity = O(n Log n)
 * space complexity = O(n)
 * --------------------------------
 * */
public class MergeSort {

    public static int[] sort(int[] A) {
        sort(A, 0, A.length - 1, new int[A.length]);
        return A;
    }

    private static void sort(int[] A, int leftStart, int rightEnd, int[] slate) {
        // leaf node case
        if (leftStart >= rightEnd) {
            return;
        }
        // divide
        int mid = (leftStart + rightEnd) / 2;
        //left sort
        sort(A, leftStart, mid, slate);
        // right sort
        sort(A, mid + 1, rightEnd, slate);
        // conquer - merge the halves
        merge(A,leftStart,rightEnd,slate);
    }

    private static void merge(int[] A, int leftStart, int rightEnd, int[] slate) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;

        int left = leftStart;
        int right = rightStart;
        int index = left;

        while (left <= leftEnd && right <= rightEnd) {
            if (A[left] <= A[right]) {
                slate[index] = A[left];
                left++;
            }else {
                slate[index] = A[right];
                right++;
            }
            index++;
        }

        // copy remaining elements (only one of those following TWO lines will be executed)
        System.arraycopy(A,left,slate, index, leftEnd - left + 1);
        System.arraycopy(A,right,slate, index, rightEnd - right + 1);
        System.arraycopy(slate,leftStart,A,leftStart,rightEnd - leftStart + 1);
    }
}
