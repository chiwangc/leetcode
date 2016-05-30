package me.chiwang.leetcode.problem042;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals(6, solution.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
    }

    @Test
    public void testCase2() {
	assertEquals(0, solution.trap(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
    }
    
    @Test
    public void testCase3() {
	assertEquals(0, solution.trap(new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
    
    @Test
    public void testCase4() {
	assertEquals(8, solution.trap(new int[] {1, 1, 1, 0, 3, 3, 0, 4, 4, 4, 0, 5, 6, 7}));
    }
    
    @Test
    public void testCase5() {
	assertEquals(27, solution.trap(new int[] {6, 7, 8, 9, 5, 3, 2, 1, 6, 4, 1, 7}));
    }
    
    @Test
    public void testCase6() {
	assertEquals(0, solution.trap(new int[] {}));
    }
    
    @Test
    public void testCase7() {
	assertEquals(35, solution.trap(new int[] {6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6}));
    }
    
    @Test
    public void testCase8() {
	assertEquals(6, solution.trap(new int[] {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}));
    }
    
    @Test
    public void testCase9() {
	assertEquals(0, solution.trap(new int[] {1, 10}));
    }
    
    @Test
    public void testCase10() {
	assertEquals(0, solution.trap(new int[] {5}));
    }
}
