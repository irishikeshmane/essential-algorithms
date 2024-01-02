package sorting.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.QuickSortStrategy;

public class QuickSortTest {
    @Test
    void sortLomuto() {
        // Given
        int[] expected = {4, 9, 13, 14, 19};
        int[] input = {19, 13, 4, 9, 14};

        // When
        int[] actual = QuickSort.sort(input);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    void sortHoare() {
        // Given
        int[] expected = {4, 9, 13, 14, 19};
        int[] input = {19, 13, 4, 9, 14};

        // When
        int[] actual = QuickSort.sort(input, QuickSortStrategy.HOARE);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }
}
