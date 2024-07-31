package combinatorial.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationBackTrackingTest {

    @Test
    void combineTest_1() {
        // given
        int n = 4;
        int k = 2;
        List<List<Integer>> expected = List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4));

        // when
        CombinationBackTracking combinationBackTracking = new CombinationBackTracking();
        List<List<Integer>> actual = combinationBackTracking.combine(n, k);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);

    }
}
