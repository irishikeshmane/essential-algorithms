package combinatorial.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromePartitioningTest {
    @Test
    void combineTest_1() {
        // given
        String s = "aab";
        List<List<String>> expected = List.of(List.of("a","a","b"), List.of("aa","b"));

        // when
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        List<List<String>> actual = palindromePartitioning.partition(s);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }
    @Test
    void combineTest_2() {
        // given
        String s = "a";
        List<List<String>> expected = List.of(List.of("a"));

        // when
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        List<List<String>> actual = palindromePartitioning.partition(s);

        // then
        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }
}