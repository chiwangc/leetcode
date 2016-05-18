/***********************************************************************************************************************
 * 
 * LeetCode Problem 33. Search in Rotated Sorted Array
 * 
 * Problem:
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem033;

public class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }
    
    private int search(int[] nums, int target, int startIdx, int endIdx) {

	int midIdx = (startIdx + endIdx) / 2;
	
	int left = nums[startIdx];	
	int mid = nums[midIdx];
	int right = nums[endIdx];
	
	if (left == target)
	    return startIdx;
	
	if (mid == target) 
	    return midIdx;
	
	if (right == target)
	    return endIdx;
	
	if (left < mid) {
	    // This section is well-ordered
	    if (target < mid && midIdx - startIdx > 1) {
		int result = search(nums, target, startIdx + 1, midIdx - 1);
		if (result != -1) {
		    return result;
		}
	    }
	} else {
	    // This section is not well-ordered
	    if (midIdx - startIdx > 1) {
		int result = search(nums, target, startIdx + 1, midIdx - 1);
		if (result != -1) {
		    return result;
		}
	    }
	}
	
	if (mid < right) {
	    // This section is well-ordered
	    if (target < right && endIdx - midIdx > 1) {
		int result = search(nums, target, midIdx + 1, endIdx - 1);
		if (result != -1) {
		    return result;
		}
	    }
	} else {
	    // This section is not well-ordered
	    if (endIdx - midIdx > 1) {
		int result = search(nums, target, midIdx + 1, endIdx - 1);
		if (result != -1) {
		    return result;
		}
	    }
	}
	
	return -1;
    }
}