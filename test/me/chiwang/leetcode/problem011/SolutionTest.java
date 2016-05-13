package me.chiwang.leetcode.problem011;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void testCase1() {
		assertEquals(3, solution.maxArea(new int[] { 1, 1, 2, 1 }));
	}

	@Test
	public void testCase2() {
		assertEquals(12, solution.maxArea(new int[] { 3, 2, 1, 2, 3 }));
	}

	@Test
	public void testCase3() {
		assertEquals(0, solution.maxArea(new int[] { 0, 0 }));
	}

	@Test
	public void testCase4() {
		assertEquals(8, solution.maxArea(new int[] { 1, 2, 3, 3, 3, 2, 1 }));
	}

	@Test
	public void testCase5() {
		assertEquals(12, solution.maxArea(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
	}

	@Test
	public void testCase6() {
		assertEquals(16, solution.maxArea(new int[] { 4, 1, 3, 2, 5 }));
	}

	@Test
	public void testCase7() {
		assertEquals(16, solution.maxArea(new int[] { 1, 2, 4, 8, 16, 32 }));
	}

	@Test
	public void testCase8() {
		assertEquals(99, solution.maxArea(new int[] { 100, 99, 1, 2, 5, 9 }));
	}

	@Test
	public void testCase9() {
		assertEquals(99, solution.maxArea(new int[] { 1, 2, 5, 9, 100, 99 }));
	}

	@Test
	public void testCase10() {
		assertEquals(99, solution.maxArea(new int[] { 1, 2, 100, 99, 5, 9 }));
	}
}
