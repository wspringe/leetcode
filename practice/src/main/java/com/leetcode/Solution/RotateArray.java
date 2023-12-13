package com.leetcode.Solution;

public class RotateArray {

    /*
     * Given an integer array nums, rotate the array to the right by k steps, where
     * k is non-negative.
     * 
     * Notes
     * Solution could shift the elements in the array one at a time, but k is up to
     * 10^5, so that wouldnt be good
     * Solution should definitely be done in a single loop
     * It does not have to be done in-place, so could create a new array and fill
     * the values
     * Could try swapping the elements in the array
     * 
     * Might be able to be done with bit shifting?
     */
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }

        int[] shifted = nums.clone();

        for (int i = 0; i < nums.length; i++) {
            if (i + k < nums.length) {
                nums[i + k] = shifted[i];
            } else {
                nums[nums.length % k] = shifted[i];
            }
        }
    }
}
