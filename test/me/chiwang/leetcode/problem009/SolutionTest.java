package me.chiwang.leetcode.problem009;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertTrue(solution.isPalindrome(12321));
    }
    
    @Test
    public void testCase2() {
	assertTrue(solution.isPalindrome(1221));
    }
    
    @Test
    public void testCase3() {
	assertFalse(solution.isPalindrome(12345));
    }
    
    @Test
    public void testCase4() {
	assertFalse(solution.isPalindrome(1234));
    }
    
    @Test
    public void testCase5() {
	assertFalse(solution.isPalindrome(-1234));
    }
    
    @Test
    public void testCase6() {
	assertTrue(solution.isPalindrome(1));
    }
    
    @Test
    public void testCase7() {
	assertTrue(solution.isPalindrome(11));
    }
    
    @Test
    public void testCase8() {
	assertFalse(solution.isPalindrome(12));
    }
    
    @Test
    public void testCase9() {
	assertTrue(solution.isPalindrome(321123));
    }
    
    @Test
    public void testCase10() {
	assertFalse(solution.isPalindrome(87));
    }

}
