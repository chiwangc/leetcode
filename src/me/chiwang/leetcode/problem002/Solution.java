/***********************************************************************************************************************
 * 
 * LeetCode Problem 2. Add Two Numbers
 * 
 * Problem:
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem002;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
	val = x;
    }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	return addTwoNumbers(l1, l2, false);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, boolean carryBit) {

	final int val1 = (l1 == null ? 0 : l1.val);
	final int val2 = (l2 == null ? 0 : l2.val);
	final int carry = (carryBit ? 1 : 0);

	final int sum = val1 + val2 + carry;
	final boolean nextCarryBit = (sum > 9 ? true : false);

	final ListNode thisNode = new ListNode(sum % 10);

	if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || nextCarryBit) {
	    ListNode nextNode = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next, nextCarryBit);
	    thisNode.next = nextNode;
	}

	return thisNode;
    }
}
