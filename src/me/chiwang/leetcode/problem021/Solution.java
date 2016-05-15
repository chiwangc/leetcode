/***********************************************************************************************************************
 * 
 * LeetCode Problem 21. Merge Two Sorted Lists
 * 
 * Problem:
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the 
 * nodes of the first two lists. 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem021;

public class Solution {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        
        while (l1 != null && l2 != null) {
        	// Find the small one
        	if (l1.val < l2.val) {
        		curr.next = l1;
        		l1 = l1.next;
        	} else {
        		curr.next = l2;
        		l2 = l2.next;
        	}
        	curr = curr.next;
        }
        
        if (l1 != null) {
        	curr.next = l1;
        }
        
        if (l2 != null) {
        	curr.next = l2;
        }
        
        return head.next;
    }
    
    private static class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
	}
    
    public static void main(String[] args) {
    	ListNode l1 = new ListNode(1);
    	ListNode l2 = new ListNode(2);
    	ListNode l3 = new ListNode(3);
    	ListNode l4 = new ListNode(4);
    	ListNode l5 = new ListNode(5);
    	ListNode l6 = new ListNode(6);
    	ListNode l7 = new ListNode(7);
    	ListNode l8 = new ListNode(8);
    	
    	l1.next = l3;
    	l3.next = l5;
    	l5.next = l7;
    	l2.next = l4;
    	l4.next = l6;
    	l6.next = l8;
    	
    	ListNode head = new Solution().mergeTwoLists(l1, l2);
    	
    	while (head != null) {
    		System.out.print(head.val + " -> ");
    		head = head.next;
    	}
    			
    }
}