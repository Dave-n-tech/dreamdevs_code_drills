package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    @Test
    void testAllSumDirectionsEqualsSumReturnsTrue() {
        int[][] input = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        int sum = 15;
        assertEquals(true, MagicSquare.allSumDirectionsEqualsSum(input, sum));
    }

    @Test
    void testAllSumDirectionsEqualsSumReturnsFalse() {
        int[][] input = {
                {8, 3, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        int sum = 15;
        assertEquals(false, MagicSquare.allSumDirectionsEqualsSum(input, sum));
    }
}