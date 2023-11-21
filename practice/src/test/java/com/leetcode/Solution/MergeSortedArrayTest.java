package com.leetcode.Solution;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void itShouldMergePopulatedArrays() {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 3, nums2, nums2.length);

        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);
    }

    @Test
    public void itShouldMergeEmptyArray() {
        int nums1[] = { 1 };
        int nums2[] = {};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 1, nums2, nums2.length);

        assertArrayEquals(new int[] { 1 }, nums1);
    }

    @Test
    public void itShouldMergeArrayWithOnly0() {
        int nums1[] = { 0 };
        int nums2[] = { 1 };

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 0, nums2, nums2.length);

        assertArrayEquals(new int[] { 1 }, nums1);
    }
}
