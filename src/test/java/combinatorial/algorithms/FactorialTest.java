package combinatorial.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sorting.algorithms.QuickSort;

public class FactorialTest {

    @Test
    void factTest() {
        // Given
        int input = 4;
        int expected = 24;

        // When
        int actual = Factorial.fact(input);

        // Then
        Assertions.assertEquals(expected,actual);
    }
}
