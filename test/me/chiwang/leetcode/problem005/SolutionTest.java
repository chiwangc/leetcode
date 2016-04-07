package me.chiwang.leetcode.problem005;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	assertEquals("aba", solution.longestPalindrome("aaba"));
    }
    
    @Test
    public void testCase2() {
	assertEquals("abcdedcba", solution.longestPalindrome("abcdedcbaa"));
    }
    
    @Test
    public void testCase3() {
	assertEquals("abcddcba", solution.longestPalindrome("xyzabcddcbaxyz"));
    }
    
    @Test
    public void testCase4() {
	assertEquals("xxxxxxxxxx", solution.longestPalindrome("xxxxxxxxxxzz"));
    }
    
    @Test
    public void testCase5() {
	assertEquals("bb", solution.longestPalindrome("abbc"));
    }
    
    @Test
    public void testCase6() {
	assertEquals("ccc", solution.longestPalindrome("aabbcccddeeff"));
    }
    
    @Test
    public void testCase7() {
	assertEquals("defefed", solution.longestPalindrome("abcdefedefefeda"));
    }
    
    @Test
    public void testCase8() {
	assertEquals("bbcdcbb", solution.longestPalindrome("abbbcdcbbcade"));
    }
    
    @Test
    public void testCase9() {
	assertEquals("bbcccdddcccbb", solution.longestPalindrome("bbbcccdddcccbbadrf"));
    }
    
    @Test
    public void testCase10() {
	assertEquals("abbaabba", solution.longestPalindrome("abbaabbabb"));
    }

}
