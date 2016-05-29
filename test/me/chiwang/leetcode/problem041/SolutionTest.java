package me.chiwang.leetcode.problem041;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	private Solution solution = new Solution();
	
	@Test
	public void testCase1() {
		assertEquals(3, solution.firstMissingPositive(new int[] {1, 2, 0}));
	}
	
	@Test
	public void testCase2() {
		assertEquals(2, solution.firstMissingPositive(new int[] {3, 4, -1, 1}));
	}
	
	@Test
	public void testCase3() {
		assertEquals(6, solution.firstMissingPositive(new int[] {5, 4, 3, 2, 1}));
	}
	
	@Test
	public void testCase4() {
		assertEquals(1, solution.firstMissingPositive(new int[] {-1, -2, -3, -4, -5}));
	}
	
	@Test
	public void testCase5() {
		assertEquals(2, solution.firstMissingPositive(new int[] {1, 1}));
	}
	
	@Test
	public void testCase6() {
		assertEquals(4, solution.firstMissingPositive(new int[] {1, 2, 1, 2, 3}));
	}
	
	@Test
	public void testCase7() {
		assertEquals(1, solution.firstMissingPositive(new int[] {6, 5, 4, 3, 2}));
	}
	
	@Test
	public void testCase8() {
		assertEquals(2, solution.firstMissingPositive(new int[] {1, -4, -3, -1, 1}));
	}
	
	@Test
	public void testCase9() {
		assertEquals(10, solution.firstMissingPositive(new int[] {2, 4, 6, 8, 1, 3, 5, 7, 9}));
	}
	
	@Test
	public void testCase10() {
		assertEquals(8, solution.firstMissingPositive(new int[] {5, 3, 7, 9, 1, 5, 2, 4, 6}));
	}
}
