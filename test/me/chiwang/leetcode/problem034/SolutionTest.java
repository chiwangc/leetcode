package me.chiwang.leetcode.problem034;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	int[] result = solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 3);
	assertEquals(-1, result[0]);
	assertEquals(-1, result[1]);
    }
    
    @Test
    public void testCase2() {
	int[] result = solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8);
	assertEquals(3, result[0]);
	assertEquals(4, result[1]);
    }
    
    @Test
    public void testCase3() {
	int[] result = solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6);
	assertEquals(-1, result[0]);
	assertEquals(-1, result[1]);
    }
    
    @Test
    public void testCase4() {
	int[] result = solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 12);
	assertEquals(-1, result[0]);
	assertEquals(-1, result[1]);
    }
    
    @Test
    public void testCase5() {
	int[] result = solution.searchRange(new int[] {5, 5, 5, 5, 5, 5, 5}, 5);
	assertEquals(0, result[0]);
	assertEquals(6, result[1]);
    }

    @Test
    public void testCase6() {
	int[] result = solution.searchRange(new int[] {7, 7, 7, 7, 7, 10}, 7);
	assertEquals(0, result[0]);
	assertEquals(4, result[1]);
    }
    
    @Test
    public void testCase7() {
	int[] result = solution.searchRange(new int[] {3, 7, 7, 7, 7, 7}, 7);
	assertEquals(1, result[0]);
	assertEquals(5, result[1]);
    }
    
    @Test
    public void testCase8() {
	int[] result = solution.searchRange(new int[] {1, 2, 3, 4, 5, 6}, 1);
	assertEquals(0, result[0]);
	assertEquals(0, result[1]);
    }
    
    @Test
    public void testCase9() {
	int[] result = solution.searchRange(new int[] {1, 2, 3, 4, 5, 6}, 6);
	assertEquals(5, result[0]);
	assertEquals(5, result[1]);
    }
    
    @Test
    public void testCase10() {
	int[] result = solution.searchRange(new int[] {1, 2, 3, 4, 5, 6}, 4);
	assertEquals(3, result[0]);
	assertEquals(3, result[1]);
    }
}

