package me.chiwang.leetcode.problem013;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	assertEquals(1, solution.romanToInt("I"));
    }
    
    @Test
    public void testCase2() {
	assertEquals(3, solution.romanToInt("III"));
    }
    
    @Test
    public void testCase3() {
	assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }
    
    @Test
    public void testCase4() {
	assertEquals(1954, solution.romanToInt("MCMLIV"));
    }
    
    @Test
    public void testCase5() {
	assertEquals(1990, solution.romanToInt("MCMXC"));
    }
    
    @Test
    public void testCase6() {
	assertEquals(2014, solution.romanToInt("MMXIV"));
    }
    
    @Test
    public void testCase7() {
	assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    public void testCase8() {
	assertEquals(9, solution.romanToInt("IX"));
    }
    
    @Test
    public void testCase9() {
	assertEquals(40, solution.romanToInt("XL"));
    }
    
    @Test
    public void testCase10() {
	assertEquals(90, solution.romanToInt("XC"));
    }
    
    @Test
    public void testCase11() {
	assertEquals(400, solution.romanToInt("CD"));
    }
    
    @Test
    public void testCase12() {
	assertEquals(900, solution.romanToInt("CM"));
    }
}
