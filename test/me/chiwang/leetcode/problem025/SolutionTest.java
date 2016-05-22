package me.chiwang.leetcode.problem025;

import org.junit.Test;

import me.chiwang.leetcode.ListNode;
import me.chiwang.leetcode.ListNodes;

import static me.chiwang.leetcode.Asserts.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	l1 = solution.reverseKGroup(l1, 2);

	ListNode l2 = ListNodes.getListNodes(2, 1, 4, 3, 5);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase2() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	l1 = solution.reverseKGroup(l1, 3);

	ListNode l2 = ListNodes.getListNodes(3, 2, 1, 4, 5);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase3() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	l1 = solution.reverseKGroup(l1, 1);

	ListNode l2 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase4() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	l1 = solution.reverseKGroup(l1, 4);

	ListNode l2 = ListNodes.getListNodes(4, 3, 2, 1, 5);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase5() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	l1 = solution.reverseKGroup(l1, 5);

	ListNode l2 = ListNodes.getListNodes(5, 4, 3, 2, 1);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase6() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	l1 = solution.reverseKGroup(l1, 6);

	ListNode l2 = ListNodes.getListNodes(1, 2, 3, 4, 5);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase7() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5, 6, 7, 8);
	l1 = solution.reverseKGroup(l1, 2);

	ListNode l2 = ListNodes.getListNodes(2, 1, 4, 3, 6, 5, 8, 7);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase8() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5, 6, 7, 8);
	l1 = solution.reverseKGroup(l1, 4);

	ListNode l2 = ListNodes.getListNodes(4, 3, 2, 1, 8, 7, 6, 5);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase9() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5, 6, 7, 8, 9);
	l1 = solution.reverseKGroup(l1, 4);

	ListNode l2 = ListNodes.getListNodes(4, 3, 2, 1, 8, 7, 6, 5, 9);
	assertListNodeEquals(l2, l1);
    }

    @Test
    public void testCase10() {
	ListNode l1 = ListNodes.getListNodes(1, 2, 3, 4, 5, 6, 7, 8);
	l1 = solution.reverseKGroup(l1, 3);

	ListNode l2 = ListNodes.getListNodes(3, 2, 1, 6, 5, 4, 7, 8);
	assertListNodeEquals(l2, l1);
    }
}
