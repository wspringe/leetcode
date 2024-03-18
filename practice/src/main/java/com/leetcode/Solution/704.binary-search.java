package com.leetcode.Solution;

/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 * Simple binary search implementation.
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int guess;
        while (min <= max) {
            guess = (min + max) / 2;
            if (nums[guess] == target) {
                return guess;
            } else {
                if (nums[guess] < target) {
                    min = guess + 1;
                } else {
                    max = guess - 1;
                }
            }
        }

        return -1;

    }
}
// @lc code=end
