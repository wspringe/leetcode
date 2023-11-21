package com.leetcode.Solution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void itShouldRemoveElementFromSmallArray() {
        int[] nums = { 3, 2, 2, 3 };

        RemoveElement removeElement = new RemoveElement();
        int actual = removeElement.removeElement(nums, 3);

        assertArrayEquals(new int[] { 2, 2, -1, -1 }, nums);
        assertEquals(2, actual);
    }
}
