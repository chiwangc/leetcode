package me.chiwang.leetcode.problem035;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals(2, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }

    @Test
    public void testCase2() {
	assertEquals(1, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }

    @Test
    public void testCase3() {
	assertEquals(4, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

    @Test
    public void testCase4() {
	assertEquals(0, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
    }

    @Test
    public void testCase5() {
	assertEquals(0, solution.searchInsert(new int[] { 1, 2, 3, 4, 5, 6}, 0));
    }
    
    @Test
    public void testCase6() {
	assertEquals(1, solution.searchInsert(new int[] { 1, 2, 3, 4, 5, 6}, 2));
    }
    
    @Test
    public void testCase7() {
	assertEquals(0, solution.searchInsert(new int[] { 1, 2, 3, 4, 5, 6}, 1));
    }
    
    @Test
    public void testCase8() {
	assertEquals(5, solution.searchInsert(new int[] { 1, 2, 3, 4, 5, 6}, 6));
    }
    
    @Test
    public void testCase9() {
	assertEquals(5, solution.searchInsert(new int[] { 1, 2, 3, 4, 5, 6}, 7));
    }
    
    @Test
    public void testCase10() {
	assertEquals(3, solution.searchInsert(new int[] { 1, 2, 3, 4, 5, 6}, 4));
    }
}
