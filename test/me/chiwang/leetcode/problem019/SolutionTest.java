package me.chiwang.leetcode.problem019;

import org.junit.Test;

import me.chiwang.leetcode.Asserts;
import me.chiwang.leetcode.ListNode;
import me.chiwang.leetcode.ListNodes;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 1);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase2() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 2);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase3() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 3);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase4() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 4);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase5() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 7, 6, 4, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 5);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase6() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 7, 5, 4, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 6);
	
	Asserts.assertListNodeEquals(expected, result);
    }

    @Test
    public void testCase7() {
	ListNode expected = ListNodes.getListNodes(10, 9, 8, 6, 5, 4, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 7);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase8() {
	ListNode expected = ListNodes.getListNodes(10, 9, 7, 6, 5, 4, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 8);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase9() {
	ListNode expected = ListNodes.getListNodes(10, 8, 7, 6, 5, 4, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 9);
	
	Asserts.assertListNodeEquals(expected, result);
    }
    
    @Test
    public void testCase10() {
	ListNode expected = ListNodes.getListNodes(9, 8, 7, 6, 5, 4, 3, 2, 1);
	ListNode result = solution.removeNthFromEnd(ListNodes.getListNodes(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), 10);
	
	Asserts.assertListNodeEquals(expected, result);
    }
}
