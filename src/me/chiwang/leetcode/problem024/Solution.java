/***********************************************************************************************************************
 * 
 * LeetCode Problem 24. Swap Nodes in Pairs 
 * 
 * Problem:
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.  
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem024;

public class Solution {
	
    public ListNode swapPairs(ListNode head) {
    	ListNode result = new ListNode(0);
    	result.next = head;
    	
    	ListNode curr = result;
    	
    	while (curr.next != null) {
    		ListNode a = curr.next;
    		ListNode b = a.next;
    		
    		if (b != null) {
    			a.next = b.next;
    			b.next = a;
    			curr.next = b;    			
    		} else {
    			break;
    		}
    		
    		curr = a;
    	}
    	
        
    	return result.next;
    }
    
    private static class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
    }
}
