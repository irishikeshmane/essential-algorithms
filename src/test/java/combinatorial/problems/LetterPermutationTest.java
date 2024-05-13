package combinatorial.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LetterPermutationTest {

    @Test
    void letterCasePermutationTest_1() {
        // given
        String s = "a1b2"; // 3z4
        List<String> expected = List.of("a1b2", "a1B2", "A1b2", "A1B2");

        // when
        LetterPermutation letterPermutation = new LetterPermutation();
        List<String> actual = letterPermutation.letterCasePermutation(s);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void letterCasePermutationTest_2() {
        // given
        String s = "3z4"; //
        List<String> expected = List.of("3z4", "3Z4");

        // when
        LetterPermutation letterPermutation = new LetterPermutation();
        List<String> actual = letterPermutation.letterCasePermutation(s);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
