/***********************************************************************************************************************
 * 
 * LeetCode Problem 1. Two Sum
 * 
 * Problem:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public int[] twoSum(int[] nums, int target) {
	
	Map<Integer, Integer> lookup = new HashMap<>();
	
	for (int i = 0; i < nums.length; i++) {
	    int complement = target - nums[i];
	    
	    if (lookup.containsKey(complement)) {
		return new int[] {lookup.get(complement), i};
	    }	    
	    lookup.put(nums[i], i);
	}
	
	return null;
    }
}
