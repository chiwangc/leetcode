package me.chiwang.leetcode.problem010;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	assertFalse(solution.isMatch("aa", "a"));
    }
    
    @Test
    public void testCase2() {
	assertTrue(solution.isMatch("aa", "aa"));
    }
    
    @Test
    public void testCase3() {
	assertFalse(solution.isMatch("aaa", "aa"));
    }
    
    @Test
    public void testCase4() {
	assertTrue(solution.isMatch("aa", "a*"));
    }
    
    @Test
    public void testCase5() {
	assertTrue(solution.isMatch("aa",  ".*"));
    }
    
    @Test
    public void testCase6() {
	assertTrue(solution.isMatch("ab", ".*"));
    }
    
    @Test
    public void testCase7() {
	assertTrue(solution.isMatch("aab", "c*a*b"));
    }
    
    @Test
    public void testCase8() {
	assertFalse(solution.isMatch("a", ".*..a*"));
    }
    
    @Test
    public void testCase9() {
	assertFalse(solution.isMatch("abcd", "d*"));
    }
    
    @Test
    public void testCase10() {
	assertTrue(solution.isMatch("aabb", ".*a*b*c*."));
    }

}
