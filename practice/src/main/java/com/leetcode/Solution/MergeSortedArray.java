package com.leetcode.Solution;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums1Pointer >= 0 && nums2Pointer < 0) {
                nums1[i] = nums1[nums1Pointer];
                nums1Pointer -= 1;
            } else if (nums1Pointer < 0 && nums2Pointer >= 0) {
                nums1[i] = nums2[nums2Pointer];
                nums2Pointer -= 1;
            } else {

                if (nums2[nums2Pointer] >= nums1[nums1Pointer]) {
                    nums1[i] = nums2[nums2Pointer];
                    nums2Pointer -= 1;
                } else {
                    nums1[i] = nums1[nums1Pointer];
                    nums1Pointer -= 1;
                }
            }
        }
    }
}
