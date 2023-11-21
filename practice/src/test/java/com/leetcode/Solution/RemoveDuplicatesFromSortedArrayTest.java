package com.leetcode.Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void itShouldReturnUniqueElementsInShortArray() {
        int[] nums = { 1, 2 };

        RemoveDuplicatesFromSortedArray testObject = new RemoveDuplicatesFromSortedArray();
        int actual = testObject.removeDuplicates(nums);

        assertEquals(2, actual);
    }

    @Test
    public void itShouldReturnUniqueElementsInLongArray() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        RemoveDuplicatesFromSortedArray testObject = new RemoveDuplicatesFromSortedArray();
        int actual = testObject.removeDuplicates(nums);

        assertEquals(5, actual);
    }
}
