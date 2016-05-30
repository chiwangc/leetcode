/***********************************************************************************************************************
 * 
 * LeetCode Problem 42. Trapping Rain Water
 * 
 * Problem:
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 * For example, 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem042;

public class Solution {
    public int trap(int[] heights) {

	if (heights == null || heights.length < 3)
	    return 0;

	int sum = 0;
	int leftIdx = 0;
	int rightIdx = heights.length - 1;

	int maxLeftHeight = 0;
	int maxRightHeight = 0;

	while (leftIdx < rightIdx) {
	    maxLeftHeight = maxLeftHeight > heights[leftIdx] ? maxLeftHeight : heights[leftIdx];
	    maxRightHeight = maxRightHeight > heights[rightIdx] ? maxRightHeight : heights[rightIdx];
	    sum += maxLeftHeight > maxRightHeight ? maxRightHeight - heights[rightIdx--]
		    : maxLeftHeight - heights[leftIdx++];
	}

	return sum;
    }
}