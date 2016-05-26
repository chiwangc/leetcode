package me.chiwang.leetcode.problem038;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void test() {
	assertEquals("1", solution.countAndSay(1));
	assertEquals("11", solution.countAndSay(2));
	assertEquals("21", solution.countAndSay(3));
	assertEquals("1211", solution.countAndSay(4));
	assertEquals("111221", solution.countAndSay(5));
	assertEquals("312211", solution.countAndSay(6));
	assertEquals("13112221", solution.countAndSay(7));
    }

}
