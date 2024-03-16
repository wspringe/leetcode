package com.leetcode.Solution;

import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 * The question is a little difficult to understand. I am not sure if the string can contain parenthesis out of order.
 * For example, is '([])' valid? or is it in only pairs of 2? Is '[(])' valid? Each parenthesis has a corresponding closer.
 * 
 * I suppose the easiest way to do this is to program to test if the stack is invalid to return false. Otherwise, return true.
 * I'll want to check if the input has more than one character.
 * If char n of the string is an opening parenthesis, push the corresponding closing character onto the stack. If the current char is not an opening char, peek the top of the stack and see if they're equivalent.
 * If they are equivalent, pop the stack. If they aren't return false (wrong closing char).
 * If the loop finishes and the stack is not empty, return false.
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        char expected;

        if (n <= 1) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(')');
                continue;
            } else if (c == '[') {
                stack.push(']');
                continue;
            } else if (c == '{') {
                stack.push('}');
                continue;
            }

            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
// @lc code=end
