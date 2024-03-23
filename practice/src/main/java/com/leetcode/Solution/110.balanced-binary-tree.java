package com.leetcode.Solution;

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 * 
 * Just a regular binary tree here. Height balanced binary trees seem to mean
 * that the depths should be equivalent on left and right sides and not differ
 * by more than 1.
 * I should return true until it is false.
 * I also cannot climb upwards on the tree, so I need to go down each side and
 * have some way of tracking the depths of each.
 * The solution here is to ascertain the heights of left and right branches from
 * the root node. If the heights different by less than 1, it's true.
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }
}
// @lc code=end
