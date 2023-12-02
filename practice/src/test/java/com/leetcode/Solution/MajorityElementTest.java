package com.leetcode.Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElementTest {
    
    @Test
    public void itShouldReturnMajorityElementSmallArray() {
        int[] nums = {3, 2, 3};

        MajorityElement majorityElement = new MajorityElement();
        int actual = majorityElement.majorityElement(nums);

        assertEquals(3, actual);
    }

    @Test
    public void itShouldReturnMajorityElementLargeArray() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        MajorityElement majorityElement = new MajorityElement();
        int actual = majorityElement.majorityElement(nums);

        assertEquals(2, actual);
    }
}
