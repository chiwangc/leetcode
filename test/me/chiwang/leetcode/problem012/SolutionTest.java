package me.chiwang.leetcode.problem012;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void testCase1() {
		assertEquals("I", solution.intToRoman(1));
	}

	@Test
	public void testCase2() {
		assertEquals("III", solution.intToRoman(3));
	}
	
	@Test
	public void testCase3() {
    	assertEquals("MMMCMXCIX", solution.intToRoman(3999));
	}
	
	@Test
	public void testCase4() {
    	assertEquals("MCMLIV", solution.intToRoman(1954));
	}

	@Test
	public void testCase5() {
    	assertEquals("MCMXC", solution.intToRoman(1990));
	}
	
	@Test
	public void testCase6() {
    	assertEquals("MMXIV", solution.intToRoman(2014));
	}
	
	@Test
	public void testCase7() {
    	assertEquals("IV", solution.intToRoman(4));
	}
	
	@Test
	public void testCase8() {
    	assertEquals("IX", solution.intToRoman(9));
	}
	
	@Test
	public void testCase9() {
    	assertEquals("XL", solution.intToRoman(40));
	}
	
	@Test
	public void testCase10() {
    	assertEquals("XC", solution.intToRoman(90));
	}
	
	@Test
	public void testCase11() {
    	assertEquals("CD", solution.intToRoman(400));
	}
	
	@Test
	public void testCase12() {
    	assertEquals("CM", solution.intToRoman(900));
	}
}