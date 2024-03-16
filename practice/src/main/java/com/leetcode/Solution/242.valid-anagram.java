package com.leetcode.Solution;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 * Simple. Make a map of charater to hits. If number of hits is > 0, or a hit is missed, return false
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sLength; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < tLength; i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }

            if (map.get(c) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return true;

    }
}
// @lc code=end
