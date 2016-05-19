/***********************************************************************************************************************
 * 
 * LeetCode Problem 34. Search for a Range
 * 
 * Problem:
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4]. 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem034;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = searchLeft(nums, target, 0, nums.length - 1);
        result[1] = searchRight(nums, target, 0, nums.length - 1);
        
        return result;
    }
    
    private int searchLeft(int[] nums, int target, int startIdx, int endIdx) {
	
	int left = nums[startIdx];
	int right = nums[endIdx];
	
	// Terminate condition
	if (endIdx - startIdx < 2) {
	    if (left == target)	return startIdx;
	    if (right == target) return endIdx;
	    return -1;
	}
	
	int midIdx = (startIdx + endIdx) / 2;
	int mid = nums[midIdx];
	
	if (target <= mid) {
	    return searchLeft(nums, target, startIdx, midIdx);
	} else {
	    return searchLeft(nums, target, midIdx + 1, endIdx);
	}
    }
    
    private int searchRight(int[] nums, int target, int startIdx, int endIdx) {
	
	int left = nums[startIdx];
	int right = nums[endIdx];
	
	if (endIdx - startIdx < 2) {
	    if (right == target) return endIdx;
	    if (left == target) return startIdx;
	    return -1;
	}
	
	int midIdx = (startIdx + endIdx) / 2;
	int mid = nums[midIdx];
	
	if (target >= mid) {
	    return searchRight(nums, target, midIdx, endIdx);
	} else {
	    return searchRight(nums, target, startIdx, midIdx - 1);
	}
    }
}
