package me.chiwang.leetcode.problem001;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void resultsShouldMatchTest() {
	assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {2,  7, 11, 15}, 9));
	assertArrayEquals(new int[] {1, 3}, solution.twoSum(new int[] {11, 2, 15, 7}, 9));
	assertArrayEquals(new int[] {4, 5}, solution.twoSum(new int[] {1, 3, 8, 2, 6, 9}, 15));
	assertArrayEquals(new int[] {2, 4}, solution.twoSum(new int[] {3, 1, 6, 8, 9, 2}, 15));
	assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {31, 13, 672, 18, 79, 32}, 44));
	assertArrayEquals(new int[] {0, 2}, solution.twoSum(new int[] {-15, -39, 15, 2, 7, 71}, 0));
	assertArrayEquals(new int[] {0, 5}, solution.twoSum(new int[] {-15, 15, -12, -71, 61, -31}, -46));	
	assertNull(solution.twoSum(new int[] {1, 2, 3, 4, 6, 7, 8}, 100));
	assertNull(solution.twoSum(new int[] {11, 12, 13, 24, 23, 22}, 20));
	assertNull(solution.twoSum(new int[] {-11, -12, -13, -24, -23, -22}, 20));
    }
}
