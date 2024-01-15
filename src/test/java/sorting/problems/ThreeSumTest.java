package sorting.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ThreeSumTest {

    @Test
    void caseI() {
        int[] input = {-1,0,1,2,-1,-4};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1,-1,2));
        expected.add(List.of(-1,0,1));

        List<List<Integer>> actual = ThreeSum.threeSum(input);

        System.out.println(actual.toString());
        assertIterableEquals(expected,actual);
    }
}
