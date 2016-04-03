package me.chiwang.leetcode.problem003;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testCase2() {
	assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testCase3() {
	assertEquals(26, solution.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testCase4() {
	assertEquals(2, solution.lengthOfLongestSubstring("abbcccddddeeeee"));
    }

    @Test
    public void testCase5() {
	assertEquals(8, solution.lengthOfLongestSubstring("abcdefghgfedcba"));
    }

    @Test
    public void testCase6() {
	assertEquals(6, solution.lengthOfLongestSubstring("xxxzyxwvux"));
    }

    @Test
    public void testCase7() {
	assertEquals(2, solution.lengthOfLongestSubstring("abbcccddddeeeee"));
    }

    @Test
    public void testCase8() {
	assertEquals(10, solution.lengthOfLongestSubstring("aabcdefghij"));
    }

    @Test
    public void testCase9() {
	assertEquals(4, solution.lengthOfLongestSubstring("abcdabcdabcdabcdabc"));
    }

    @Test
    public void testCase10() {
	assertEquals(9, solution.lengthOfLongestSubstring("abcdefghihgefadbc"));
    }
}
