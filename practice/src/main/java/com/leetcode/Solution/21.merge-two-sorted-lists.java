package com.leetcode.Solution;

impo

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * this is a classic recursion question. You want to return a head of the linked list which is a reference to the top of the linked list, and so you basically want to start at the bottom of the list and work your way up. Recursion is a good answer for that since it's in-place and you don't know where the end of the linked lists are.
 * Also, since it's splicing, you won't want to create a new node or anything like that.
 * The method should be straightforward. Compare the 2 node values. For the node's value that is smaller, set their next node value to another mergeTwoLists
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            } else {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
        }

        if (list1 == null) {
            return list2;
        }
        
        return list1;
            
    }
}
// @lc code=end
