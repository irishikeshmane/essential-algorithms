package sorting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IntersectionThreeSortedArraysTest {

    @Test
    void case1() {
        // Given
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(2, 5, 10));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(2, 5, 10));
        ArrayList<Integer> arr3 = new ArrayList<>(List.of(2, 5, 10));

        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 5, 10));

        ArrayList<Integer> actual = IntersectionThreeSortedArrays.find_intersection(arr1, arr2, arr3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case2() {
        // Given
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(2, 5, 10));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(2, 3, 4, 10));
        ArrayList<Integer> arr3 = new ArrayList<>(List.of(2, 4, 10));

        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 10));

        ArrayList<Integer> actual = IntersectionThreeSortedArrays.find_intersection(arr1, arr2, arr3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case3() {
        // Given
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of());
        ArrayList<Integer> arr3 = new ArrayList<>(List.of(2, 2));

        ArrayList<Integer> expected = new ArrayList<>(List.of(-1));

        ArrayList<Integer> actual = IntersectionThreeSortedArrays.find_intersection(arr1, arr2, arr3);

        Assertions.assertEquals(expected, actual);
    }
}
