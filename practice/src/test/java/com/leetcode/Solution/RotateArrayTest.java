package com.leetcode.Solution;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void itShouldRotateAnOddLengthArray() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, 3);

        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }

    @Test
    public void itShouldRotateAnEvenLengthArray() {
        int[] nums = { -1, -100, 3, 99 };

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, 2);

        assertArrayEquals(new int[] { 3, 99, -1, -100 }, nums);
    }
}
