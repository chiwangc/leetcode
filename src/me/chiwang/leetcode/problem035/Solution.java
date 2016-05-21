/***********************************************************************************************************************
 * 
 * LeetCode Problem 35. Search Insert Position
 * 
 * Problem:
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem035;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchLeft(nums, target, 0, nums.length - 1);
    }
    
    private int searchLeft(int[] nums, int target, int startIdx, int endIdx) {
	
	int left = nums[startIdx];
	int right = nums[endIdx];
	
	// Terminate condition
	if (endIdx - startIdx < 2) {
	    if (target > right) {
		return endIdx + 1;
	    } else if (target == right) {
		return endIdx;
	    } else if (target < right && target > left) {
		return endIdx;
	    } else {
		return startIdx; 
	    }
	}
	
	int midIdx = (startIdx + endIdx) / 2;
	int mid = nums[midIdx];
	
	if (mid == target) {
	    return midIdx;
	} else if (mid < target) {
	    return searchLeft(nums, target, midIdx, endIdx);
	} else {
	    return searchLeft(nums, target, startIdx, midIdx);
	}	
    }
}
