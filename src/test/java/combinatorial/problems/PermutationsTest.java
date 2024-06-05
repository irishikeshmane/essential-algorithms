package combinatorial.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PermutationsTest {
    @Test
    void permuteTest_1() {
        // given
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of(List.of(1,2,3), List.of(1,3,2), List.of(2,1,3), List.of(2,3,1), List.of(3,1,2), List.of(3,2,1));

        // when
        Permutations permutations = new Permutations();
        List<List<Integer>> actual = permutations.permute(nums);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);

    }

    @Test
    void permuteTest_2() {
        // given
        int[] nums = {1, 2, 1};
        List<List<Integer>> expected = List.of(List.of(1,2,1), List.of(1,1,2), List.of(2,1,1));

        // when
        PermutationsII permutations = new PermutationsII();
        List<List<Integer>> actual = permutations.permuteUnique(nums);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);

    }
}
