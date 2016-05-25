package me.chiwang.leetcode.problem037;

import org.junit.Test;

import me.chiwang.leetcode.Asserts;
import me.chiwang.leetcode.Sudokus;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {

    }

    @Test
    public void testCase2() {
	char[][] result = Sudokus.get("..9748...", "7........", ".2.1.9...", "..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.", "........6", "...2759..");
	solution.solveSudoku(result);
	char[][] expected = Sudokus.get("519748632","783652419","426139875","357986241","264317598","198524367","975863124","832491756","641275983");
	
	Asserts.assertMultiDimArrayEquals(expected, result);
    }

}
