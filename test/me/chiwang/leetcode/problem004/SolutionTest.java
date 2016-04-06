package me.chiwang.leetcode.problem004;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	
	private Solution solution = new Solution();

	@Test
	public void testCase1() {
		int[] a1 = new int[] {1, 2, 3, 4, 5, 6};
		int[] a2 = new int[] {1, 2, 3, 4, 5, 6};
		
		assertEquals(3.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}

	@Test
	public void testCase2() {
		int[] a1 = new int[] {1, 2, 3, 4, 5, 6};
		int[] a2 = new int[] {2, 3, 4, 5, 6};
		
		assertEquals(4.0, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase3() {
		int[] a1 = new int[] {1, 2, 3, 4, 5, 6};
		int[] a2 = new int[] {};
		
		assertEquals(3.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase4() {
		int[] a1 = new int[] {};
		int[] a2 = new int[] {2, 3, 4, 5, 6};
		
		assertEquals(4.0, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase5() {
		int[] a1 = new int[] {1};
		int[] a2 = new int[] {2, 3, 4, 5, 6};
		
		assertEquals(3.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase6() {
		int[] a1 = new int[] {1};
		int[] a2 = new int[] {2};
		
		assertEquals(1.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase7() {
		int[] a1 = new int[] {1, 1, 1, 1, 1, 1, 1};
		int[] a2 = new int[] {2, 2, 2};
		
		assertEquals(1.0, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase8() {
		int[] a1 = new int[] {1, 1, 1, 10, 10, 10, 10};
		int[] a2 = new int[] {2, 2, 2};
		
		assertEquals(2.0, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase9() {
		int[] a1 = new int[] {1, 2, 3, 4, 5};
		int[] a2 = new int[] {10, 11, 12};
		
		assertEquals(4.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase10() {
		int[] a1 = new int[] {10, 11, 12, 13, 14, 15};
		int[] a2 = new int[] {-3, -2, -1, 0};
		
		assertEquals(10.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
	
	@Test
	public void testCase11() {
		int[] a1 = new int[] {1, 3};
		int[] a2 = new int[] {2, 4};
		
		assertEquals(2.5, solution.findMedianSortedArrays(a1, a2), 0.0);
	}
}
