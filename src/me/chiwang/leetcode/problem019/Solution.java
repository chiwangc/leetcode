package me.chiwang.leetcode.problem019;

/**
 * Definition for singly-linked list.
 * 
 */
public class Solution {
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode result = new ListNode(0);
    	result.next = head;
    	
    	ListNode target = result;
    	ListNode curr = result;
    	int count = -1;
    	
    	while (curr != null) {
    		count++;
    		curr = curr.next;
    		if (count >= n + 1) {
    			target = target.next;
    		}
    	}
    	
    	target.next = target.next.next;
    	
    	return result.next;
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
    	
    	l8.next = l7;
    	l7.next = l6;
    	l6.next = l5;
    	l5.next = l4;
    	l4.next = l3;
    	l3.next = l2;
    	l2.next = l1;
    	
    	Solution solution = new Solution();
    	
    	ListNode head = solution.removeNthFromEnd(l8, 5);
    	
    	while (head != null) {
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
    
}
