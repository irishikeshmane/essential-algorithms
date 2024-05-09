package sorting.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    void case1() {
        int[] expected = {1,2,2,3,5,6};
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;

        MergeSortedArray.merge(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
        assertArrayEquals(expected,arr1);
    }

    @Test
    void case2() {
        int[] expected = {1};
        int[] arr1 = {1};
        int m = 1;
        int[] arr2 = {};
        int n = 0;

        MergeSortedArray.merge(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
        assertArrayEquals(expected,arr1);
    }

    @Test
    void case3() {
//        int[] expected = {1};
//        int[] arr1 = {1};
//        int m = 1;
//        int[] arr2 = {};
//        int n = 0;
//
//        MergeSortedArray.merge(arr1,m,arr2,n);
//        System.out.println(Arrays.toString(arr1));
//        assertArrayEquals(expected,arr1);
    }
}
