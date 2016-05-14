/***********************************************************************************************************************
 * 
 * LeetCode Problem 25. Reverse Nodes in k-Group
 * 
 * Problem:
 * 
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 *
 * You may not alter the values in the nodes, only nodes itself may be changed.
 *
 * Only constant memory is allowed.
 *
 * For example,
 * Given this linked list: 1->2->3->4->5
 * 
 * For k = 2, you should return: 2->1->4->3->5
 * 
 * For k = 3, you should return: 3->2->1->4->5
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem025;

import me.chiwang.leetcode.ListNode;

public class Solution {
	
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode start = new ListNode(0);
		start.next = head;
		
		ListNode nextGroup = reverseNextKNodes(start, k);
		while (nextGroup != null) {
			nextGroup = reverseNextKNodes(nextGroup, k);
		}
		
		return start.next;
	}
	
	private ListNode skipKElements(ListNode start, int k) {
		ListNode curr = start;
		int count = 0;
		
		while (curr != null) {
			curr = curr.next;
			if (++count == k)
				break;
		}
		
		return curr;
	}

	private ListNode reverseNextKNodes(ListNode start, int k) {
		
		ListNode end = skipKElements(start, k);
		if (end == null) return null;
		final ListNode endNext = end.next;
		
		ListNode curr = start.next;
		ListNode next = curr.next;
		ListNode nextNext = null;
		
		for (int i = 0; i < k - 1; i++) {
			if (next != null)
				nextNext = next.next;
			
			next.next = curr;
			
			curr = next;
			next = nextNext;
		}
		
		ListNode result = start.next;
		result.next = endNext;
		start.next = end;
		return result;
	}
}