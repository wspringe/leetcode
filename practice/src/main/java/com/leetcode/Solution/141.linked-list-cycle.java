package com.leetcode.Solution;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 * Can this be as simple as memory check? Perhaps keep a set of the memory
 * references to each node in the linked list. Traverse the linked list and
 * check if the next pointer has a hit in the set. If there's a hit, return true
 * 
 * Learning solution: Floyd's tortoise and the hare algorithm. You have 1 slow
 * and 1 fast pointer, and the idea is that if there's a cycle, the fast pointer
 * will catch up to the slow one.
 * You start with the slow pointer pointing at head.next and fast at
 * head.next.next, and you loop through it. The terminating condition if fast or
 * fast.next is null.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Set<ListNode> nodes = new HashSet<ListNode>();
        nodes.add(head);

        return hasHit(head.next, nodes);
    }

    boolean hasHit(ListNode node, Set<ListNode> nodes) {
        if (node == null) {
            return false;
        }
        if (nodes.contains(node)) {
            return true;
        }

        nodes.add(node);
        return hasHit(node.next, nodes);
    }
}
// @lc code=end
