package me.chiwang.leetcode.problem007;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals(-6836321, solution.reverse(-1236386));
    }
    
    @Test
    public void testCase2() {
	assertEquals(0, solution.reverse(Integer.MAX_VALUE));
    }
    
    @Test
    public void testCase3() {
	assertEquals(6836321, solution.reverse(1236386));
    }
    
    @Test
    public void testCase4() {
	assertEquals(-2143847412, solution.reverse(-2147483412));
    }
    
    @Test
    public void testCase5() {
	assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }
    
    @Test
    public void testCase6() {
	assertEquals(0, 0);
    }
    
    @Test
    public void testCase7() {
	assertEquals(13073, solution.reverse(37031));
    }
    
    @Test
    public void testCase8() {
	assertEquals(9421, solution.reverse(12490));
    }
    
    @Test
    public void testCase9() {
	assertEquals(214748364, solution.reverse(463847412));
    }

    @Test
    public void testCase10() {
	assertEquals(-2147447412, solution.reverse(-2147447412));
    }
}
