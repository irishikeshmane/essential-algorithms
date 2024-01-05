package sorting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void caseI() {
        int[] input = {2,7,11,15};
        int target = 9;

        int[] expected = {0,1};
        int[] actual = TwoSum.twoSum(input,target);

        Assertions.assertArrayEquals(expected, actual);
    }
}
