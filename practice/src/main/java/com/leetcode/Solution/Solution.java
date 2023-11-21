package com.leetcode.Solution;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int numJewels = 0;

        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    numJewels++;
                }
            }
        }

        return numJewels;
    }

    public int subarraySum(int[] nums, int k) {
        int numSubArrays = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                numSubArrays++;
            }

            int subTotal = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                subTotal += nums[j];
                if (subTotal == k) {
                    numSubArrays++;
                }
            }
        }

        return numSubArrays;
    }
}
