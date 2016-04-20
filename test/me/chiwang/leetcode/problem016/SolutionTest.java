package me.chiwang.leetcode.problem016;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	assertEquals(2, solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
    }
    
    @Test
    public void testCase2() {
	assertEquals(8, solution.threeSumClosest(new int[] {1, 2, 3, 4, 5}, 8));
    }
    
    @Test
    public void testCase3() {
	assertEquals(3, solution.threeSumClosest(new int[] {1, 1, 1, 1}, 4));
    }
    
    @Test
    public void testCase4() {
	assertEquals(5, solution.threeSumClosest(new int[] {1, -1, 4, 2}, 5));
    }
    
    @Test
    public void testCase5() {
	assertEquals(8, solution.threeSumClosest(new int[] {1, -1, 2, 5}, 9));
    }
    
    @Test
    public void testCase6() {
	assertEquals(3, solution.threeSumClosest(new int[] {1, 3, -3, 5, -5}, 4));
    }
    
    @Test
    public void testCase7() {
	assertEquals(7, solution.threeSumClosest(new int[] {1, 2, 4, 7}, 8));
    }
    
    
    @Test
    public void testCase8() {
	assertEquals(1108, solution.threeSumClosest(new int[] {168, 228, 4128, 712}, 1000));
    }
    
    @Test
    public void testCase9() {
	assertEquals(-1, solution.threeSumClosest(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1268234, -12354}, 0));
    }
    
    @Test
    public void testCase10() {
	assertEquals(86, solution.threeSumClosest(new int[] {12, 27, 96, 47, 59}, -10));
    }    
}
