/***********************************************************************************************************************
 * 
 * LeetCode Problem 19. Remove Nth Node From End of List 
 * 
 * Problem:
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass. 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem019;

import me.chiwang.leetcode.ListNode;

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
}
