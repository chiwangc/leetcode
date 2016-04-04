package me.chiwang.leetcode.problem006;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
	assertEquals("ABCDEFGHIJKLMNOP", solution.convert("ABCDEFGHIJKLMNOP", 1));
    }

    @Test
    public void test2() {
	assertEquals("AIBHJPCGKODFLNEM", solution.convert("ABCDEFGHIJKLMNOP", 5));
    }

    @Test
    public void test3() {
	assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

}
