package com.leetcode.Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void shouldAnswerWithTrueJewels() {
        Solution s = new Solution();

        int actual = s.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, actual);

        int actual2 = s.numJewelsInStones("z", "ZZ");
        assertEquals(0, actual2);
    }

    @Test
    public void shouldAnswerWithTrueSubarray() {
        Solution s = new Solution();

        int actual = s.subarraySum(new int[] { 1, 1, 1 }, 2);
        assertEquals(2, actual);

        int actual2 = s.subarraySum(new int[] { 1, 2, 3 }, 3);
        assertEquals(2, actual2);

        int actual3 = s.subarraySum(new int[] { -1, -1, 1 }, 0);
        assertEquals(1, actual3);

        int actual4 = s.subarraySum(new int[] { 1, -1, 0 }, 0);
        assertEquals(3, actual4);
    }
}
