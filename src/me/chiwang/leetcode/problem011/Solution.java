/***********************************************************************************************************************
 * 
 * LeetCode Problem 11. Container With Most Water
 * 
 * Problem:
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem011;

public class Solution {
    public int maxArea(int[] heights) {
    	int left = 0;
    	int right = heights.length - 1;
    	
    	int maxArea = 0;
    	
    	while (left < right) {
    		int area = computeArea(left, right, heights);
    		maxArea = maxArea > area ? maxArea : area;
    		
    		if (heights[left] < heights[right]) {
    			left++;
    		} else if (heights[left] > heights[right]) {
    			right--;
    		} else {
    			left++;
    			right--;
    		}
    	}
    	
    	return maxArea;
    }
    
    private int computeArea(int left, int right, int[] heights) {
    	int minHeight = heights[left] > heights[right] ? heights[right] : heights[left]; 
    	return (right - left) * minHeight;
    }
}