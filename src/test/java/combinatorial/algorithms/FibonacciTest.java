package combinatorial.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void getFibonacciTest() {
        // Given
        int input = 4;
        int expected = 24;

        // When
        int actual = Factorial.fact(input);

        // Then
        Assertions.assertEquals(expected,actual);
    }
}
