package sorting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestElementTest {

    @Test
    void case1() {
        // Given
        int[] input = {19, 13, 4, 9, 14};
        int k = 2;

        int expected = 14;
        int actual = KthLargestElement.findKthLargest(input, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case2() {
        // Given
        int[] input = {3,2,1,5,6,4};
        int k = 2;

        int expected = 5;
        int actual = KthLargestElement.findKthLargest(input, k);

        Assertions.assertEquals(expected, actual);
    }
}
