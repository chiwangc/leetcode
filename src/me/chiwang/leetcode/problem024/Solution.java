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
