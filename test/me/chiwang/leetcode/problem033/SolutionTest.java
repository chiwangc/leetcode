package me.chiwang.leetcode.problem033;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals(-1, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
    }
    
    @Test
    public void testCase2() {
	assertEquals(3, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 7));
    }
    
    @Test
    public void testCase3() {
	assertEquals(2, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 6));
    }
    
    @Test
    public void testCase4() {
	assertEquals(6, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2));
    }
    
    @Test
    public void testCase5() {
	assertEquals(5, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 1));
    }
    
    @Test
    public void testCase6() {
	assertEquals(0, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
    }
    
    @Test
    public void testCase7() {
	assertEquals(1, solution.search(new int[] {5, 1, 2, 3, 4}, 1));
    }
    
    @Test
    public void testCase8() {
	assertEquals(4, solution.search(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 1}, 6));
    }
    
    @Test
    public void testCase9() {
	assertEquals(9, solution.search(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 1}, 1));
    }

    @Test
    public void testCase10() {
	assertEquals(5, solution.search(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6));
    }
}
