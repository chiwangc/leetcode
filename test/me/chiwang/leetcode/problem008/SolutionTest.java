package me.chiwang.leetcode.problem008;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	
	private Solution solution = new Solution();

	@Test
	public void testCase1() {
		assertEquals(2147483647, solution.myAtoi("2147483647"));
	}
	
	@Test
	public void testCase2() {
	    assertEquals(-2147483648, solution.myAtoi("-2147483648"));
	}
	
	@Test
	public void testCase3() {
	    assertEquals(Integer.MAX_VALUE, solution.myAtoi("2147483648"));
	}
	
	@Test
	public void testCase4() {
	    assertEquals(Integer.MIN_VALUE, solution.myAtoi("-2147483649"));
	}
	
	@Test
	public void testCase5() {
	    assertEquals(123, solution.myAtoi("    123adf124"));
	}
	
	@Test
	public void testCase6() {
	    assertEquals(517, solution.myAtoi(" +517a d7ah23"));
	}
	
	@Test
	public void testCase7() {
	    assertEquals(0, solution.myAtoi(" dfa123a"));
	}
	
	@Test
	public void testCase8() {
	    assertEquals(0, solution.myAtoi(" +-"));
	}
	
	@Test
	public void testCase9() {
	    assertEquals(0, solution.myAtoi(" -+"));
	}
	
	@Test
	public void testCase10() {
	    assertEquals(Integer.MAX_VALUE, solution.myAtoi("9223372036854775809"));
    }
}
