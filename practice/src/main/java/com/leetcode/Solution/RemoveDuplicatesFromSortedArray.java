package com.leetcode.Solution;

public class RemoveDuplicatesFromSortedArray {
    /*
     * Given an integer array nums sorted in non-decreasing order, remove the
     * duplicates in-place such that each unique element appears only once. The
     * relative order of the elements should be kept the same. Then return the
     * number of unique elements in nums.
     * 
     * Consider the number of unique elements of nums to be k, to get accepted, you
     * need to do the following things:
     * 
     * Change the array nums such that the first k elements of nums contain the
     * unique elements in the order they were present in nums initially. The
     * remaining elements of nums are not important as well as the size of nums.
     * Return k.
     * 
     * 
     * Notes:
     * Since this is in non-decreasing order, that means the next element in the
     * array will always be equal to or greater than the element before it.
     * Because of this, we can essentially loop through the array and compare the
     * subsequent elements. However, the judge does not care about the elements at
     * the end of the array as long as the first elements of the array represent all
     * unique numbers.
     * Since the values of the non-unique numbers do not matter, we can essentially
     * start moving them to the end of the array, but this needs to be done in
     * place.
     * 
     * Algorithm:
     * n represents the current iteration of the array.
     * 1. Loop through the array starting with 1
     * 2. Compare the nth element with the n - 1 element
     * 3. If the nth element != n - 1 element, set the element at unique count to
     * nth element and increment unique count
     * 4. Repeast steps 2 through 4 until done
     */
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
