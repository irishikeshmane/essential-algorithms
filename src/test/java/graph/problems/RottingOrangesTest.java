package graph.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RottingOrangesTest {
    @Test
    void orangesRottingTest_1() {
        // given
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int expected = 4;

        // when
        RottingOranges rottingOranges = new RottingOranges();
        int actual = rottingOranges.orangesRotting(grid);

        // then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void orangesRottingTest_2() {
        // given
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int expected = -1;

        // when
        RottingOranges rottingOranges = new RottingOranges();
        int actual = rottingOranges.orangesRotting(grid);

        // then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void orangesRottingTest_3() {
        // given
        int[][] grid = {{0, 2}};
        int expected = 0;

        // when
        RottingOranges rottingOranges = new RottingOranges();
        int actual = rottingOranges.orangesRotting(grid);

        // then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void orangesRottingTest_4() {
        // given
        int[][] grid = {{2, 1, 1}, {1, 1, 1}, {0, 1, 2}};
        int expected = 2;

        // when
        RottingOranges rottingOranges = new RottingOranges();
        int actual = rottingOranges.orangesRotting(grid);

        // then
        Assertions.assertEquals(expected, actual);

    }
}
