package combinatorial.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SubsetsTest {
    @Test
    void subsetsTest_1() {
        // given
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of(List.of(), List.of(1), List.of(2), List.of(3), List.of(1, 2, 3), List.of(1, 2), List.of(1, 3), List.of(2, 3));

        // when
        Subsets subsets = new Subsets();
        List<List<Integer>> actual = subsets.subsets(nums);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }

    @Test
    void subsetsTest_2() {
        // given
        int[] nums = {1, 2, 2};
        List<List<Integer>> expected = List.of(List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(2, 2), List.of(1, 2, 2));

        // when
        SubsetsII subsets = new SubsetsII();
        List<List<Integer>> actual = subsets.subsetsWithDup(nums);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }
}
