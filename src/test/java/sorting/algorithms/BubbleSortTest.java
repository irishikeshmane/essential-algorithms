package sorting.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    void sort() {
        // Given
        int[] expected = {4, 9, 13, 14, 19};
        int[] input = {19, 13, 4, 9, 14};

        // When
        int[] actual = BubbleSort.sort(input);

        // Then
        Assertions.assertArrayEquals(expected,actual);
    }
}
