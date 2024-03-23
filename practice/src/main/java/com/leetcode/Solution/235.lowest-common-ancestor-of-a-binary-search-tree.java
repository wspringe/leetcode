package com.leetcode.Solution;

import scala.concurrent.impl.FutureConvertersImpl.P;

/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * 
 * Binary Search tree is a tree where a left branch will have values lower than
 * the root, and the right branch will have values higher
 * First thought is recursion of course and to perform a BFS to crawl through
 * the nodes. We start at the root as always and check the current node's value.
 * Since it's a binary search tree, we will know that the current node is the
 * LCA is the value is between p and q's.
 * If it's lower than both values, then we traverse the right node as they are
 * larger values than the current one.
 * If it's higher, we go down the left path.
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }
}
// @lc code=end
