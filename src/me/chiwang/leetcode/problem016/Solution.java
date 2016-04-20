/***********************************************************************************************************************
 * 
 * LeetCode Problem 16. 3Sum Closest 
 * 
 * Problem:
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem016;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
	
	Arrays.sort(nums);
	
	Integer result = null;
	
	for (int current = 0; current < nums.length; current++) {
	    
	    int left = current + 1;
	    int right = nums.length - 1;
	    
	    while (left < right) {
		int sum = nums[current] + nums[left] + nums[right];

		if (result == null || diff(sum, target) < diff(result, target)) {
		    result = sum;
		}
		
		if (sum < target) {
		    left++;
		} else if (sum > target) {
		    right--;
		} else {
		    return result;
		}
	    }
	}
	
        return result;
    }
    
    private int diff(int a, int b) {
	int diff = a - b;
	return diff > 0 ? diff : -diff;
    }
}