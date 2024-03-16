package com.leetcode.Solution;

public class LengthOfLastWord {
    /*
     * Given a string s consisting of words and spaces, return the length of the
     * last word in the string.
     * 
     * Notes
     * Easiest method is to split the string and get the length of the last element
     */
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }
}
