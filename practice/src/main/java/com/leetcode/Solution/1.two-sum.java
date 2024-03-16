package com.leetcode.Solution;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 * There's a few ways of attacking this. The brute force approach would be to loop through each value in the array twice.
 * On the outer run, loop through each element normally starting from index i...n-1. In the inner loop, do i+1...n-1, and add together the element in the outer loop and inner loop.
 * If the added elements are equivalent to the target, then return the indices as the answer.
 * 
 * Also, since this only requires addition, the order of the elements does not matter thanks to the communitative property of addition.
 * An issue with this algorithm is that it's n^2, which is of course slower the larger the nums array is.
 * 
 * Another solution is to use a hash table (programmers love hash tables) which are faster because of map access. This answer is from the solution list.
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // don't want to return null
    }
}
// @lc code=end
