package me.chiwang.leetcode.problem032;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	assertEquals(4, solution.longestValidParentheses("(())"));
    }
    
    @Test
    public void testCase2() {
	assertEquals(2, solution.longestValidParentheses("))))))))))())))))))"));
    }
    
    @Test
    public void testCase3() {
	assertEquals(6, solution.longestValidParentheses("()(())"));
    }
    
    @Test
    public void testCase4() {
	assertEquals(0, solution.longestValidParentheses(")))("));
    }
    
    @Test
    public void testCase5() {
	assertEquals(10, solution.longestValidParentheses("((((()))))))"));
    }

    @Test
    public void testCase6() {
	assertEquals(10, solution.longestValidParentheses("((((((()))))"));
    }
    
    @Test
    public void testCase7() {
	assertEquals(8, solution.longestValidParentheses("(())(()))((()))"));
    }
    
    @Test
    public void testCase8() {
	assertEquals(8, solution.longestValidParentheses("()()()())(((())))"));
    }
    
    @Test
    public void testCase9() {
	assertEquals(0, solution.longestValidParentheses(""));
    }
    
    @Test
    public void testCase10() {
	assertEquals(8, solution.longestValidParentheses("((())()))()()"));
    }
}
