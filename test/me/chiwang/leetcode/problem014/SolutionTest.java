package me.chiwang.leetcode.problem014;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals("abc", solution.longestCommonPrefix(new String[] {"abc", "abcd", "abcde"}));
    }
    
    @Test
    public void testCase2() {
	assertEquals("", solution.longestCommonPrefix(new String[] {"abc", "defg", "hijk"}));
    }    

    @Test
    public void testCase3() {
	assertEquals("a", solution.longestCommonPrefix(new String[] {"abc", "acd", "abcde"}));
    }
    
    @Test
    public void testCase4() {
	assertEquals("abcdefgh", solution.longestCommonPrefix(new String[] {"abcdefghl", "abcdefgh", "abcdefghk"}));
    }
    
    @Test
    public void testCase5() {
	assertEquals("ab", solution.longestCommonPrefix(new String[] {"abc", "ab", "abcdefghk"}));
    }
    
    @Test
    public void testCase6() {
	assertEquals("", solution.longestCommonPrefix(new String[] {"abc", "", "abcdefghk"}));
    }
    
    @Test
    public void testCase7() {
	assertEquals("abcdef", solution.longestCommonPrefix(new String[] {"abcdefgh", "abcdefi", "abcdefl"}));
    }
    
    @Test
    public void testCase8() {
	assertEquals("def", solution.longestCommonPrefix(new String[] {"defintion", "defata", "deft"}));
    }
    
    @Test
    public void testCase9() {
	assertEquals("abcd", solution.longestCommonPrefix(new String[] {"abcdefgh", "abcdfgi", "abcdihk"}));
    }
    
    @Test
    public void testCase10() {
	assertEquals("xyzwd", solution.longestCommonPrefix(new String[] {"xyzwd", "xyzwd", "xyzwd"}));
    }
}
