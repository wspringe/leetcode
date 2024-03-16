/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
 * This is another classic recursion problem for swapping the left and right
 * children of each node. Not only that, but we want to return the root node,
 * which means that we would like to stay in place.
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode leftChild = root.left;
        root.left = root.right;
        root.right = leftChild;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
// @lc code=end
