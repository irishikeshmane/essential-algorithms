package combinatorial.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/*
 * Leetcode : */

public class PhoneNumberCombinationsTest {

    @Test
    void letterCombinationsTest_1() {
        // given
        String digits = "";
        List<String> expected = List.of();

        //when
        PhoneNumberCombinations phoneNumberCombinations = new PhoneNumberCombinations();
        List<String> actual = phoneNumberCombinations.letterCombinations(digits);

        //then
        Assertions.assertIterableEquals(expected, actual);
    }
    @Test
    void letterCombinationsTest_2() {
        // given
        String digits = "23";
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        //when
        PhoneNumberCombinations phoneNumberCombinations = new PhoneNumberCombinations();
        List<String> actual = phoneNumberCombinations.letterCombinations(digits);

        //then
        Assertions.assertIterableEquals(expected, actual);
    }
}
