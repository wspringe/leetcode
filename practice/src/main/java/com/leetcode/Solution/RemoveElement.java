package com.leetcode.Solution;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int endPointer = nums.length - 1;
        int removedElementCount = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                if (i == endPointer) {
                    nums[i] = -1;
                    endPointer -= 1;
                } else {
                    nums[i] = nums[endPointer];
                    nums[endPointer] = -1;
                    endPointer -= 1;
                }
                removedElementCount += 1;
            }
        }

        return nums.length - removedElementCount;
    }
}
