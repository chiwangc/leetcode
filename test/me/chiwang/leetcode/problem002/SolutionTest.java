package me.chiwang.leetcode.problem002;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
	ListNode l1 = createListNode(2, 4, 3);
	ListNode l2 = createListNode(5, 6, 4);
	ListNode l3 = createListNode(7, 0, 8);
	ListNode l4 = solution.addTwoNumbers(l1, l2);

	assertEqualListNode(l3, l4);
    }

    @Test
    public void test2() {
	ListNode l1 = createListNode(1, 2, 3, 4, 5);
	ListNode l2 = createListNode(9, 8, 7, 6, 5);
	ListNode l3 = createListNode(0, 1, 1, 1, 1, 1);
	ListNode l4 = solution.addTwoNumbers(l1, l2);

	assertEqualListNode(l3, l4);
    }

    @Test
    public void test3() {
	ListNode l1 = createListNode(1);
	ListNode l2 = createListNode(9, 8, 7, 6, 5);
	ListNode l3 = createListNode(0, 9, 7, 6, 5);
	ListNode l4 = solution.addTwoNumbers(l1, l2);

	assertEqualListNode(l3, l4);
    }

    private ListNode createListNode(int... vals) {

	ListNode first = null;

	if (vals.length > 0) {
	    first = new ListNode(vals[0]);
	    ListNode currentNode = first;

	    for (int i = 1; i < vals.length; i++) {
		currentNode.next = new ListNode(vals[i]);
		currentNode = currentNode.next;
	    }
	}

	return first;
    }

    private void assertEqualListNode(ListNode l1, ListNode l2) {
	while (l1 != null && l2 != null) {
	    assertEquals(l1.val, l2.val);
	    l1 = l1.next;
	    l2 = l2.next;
	}

	assertNull(l1);
	assertNull(l2);
    }

}
