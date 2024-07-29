package com.leetcode.Solution;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
import java.util.Stack;

class MyQueue {
    private Stack<Integer> storage = new Stack<>();
    private Stack<Integer> bin = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        storage.push(x);
    }

    // We want the first item inserted into the stack
    public int pop() {
        if (storage.size() <= 1) {
            return storage.pop();
        } else {
            while (!storage.isEmpty()) {
                bin.push(storage.pop());
            }

            int toReturn = bin.pop();
            restore();
            return toReturn;
        }
    }

    private void restore() {
        while (!bin.isEmpty()) {
            storage.push(bin.pop());
        }
    }

    public int peek() {
        if (storage.size() <= 1) {
            return storage.peek();
        } else {
            while (!storage.isEmpty()) {
                bin.push(storage.pop());
            }

            int toReturn = bin.peek();
            restore();
            return toReturn;
        }
    }

    public boolean empty() {
        return storage.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
