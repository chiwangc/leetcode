package me.chiwang.leetcode.problem014;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals("abc", solution.longestCommonPrefix(new String[] {"abc", "abcd", "abcde"}));
    }

}
