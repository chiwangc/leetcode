/***********************************************************************************************************************
 * 
 * LeetCode Problem 15. 3Sum
 * 
 * Problem:
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note:
 * 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 *
 * For example, given array S = {-1 0 1 2 -1 -4},
 *
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	
	List<List<Integer>> triples = new ArrayList<List<Integer>>();
	
	if (nums.length < 3) {
	    return triples;
	}
	
	Arrays.sort(nums);
	
	for (int i = 0; i < nums.length - 2; i++) {
	    if (i == 0 || nums[i] > nums[i - 1]) {
		
        	int first = nums[i];
        	final int target = -first;
        	    
        	int left = i + 1;
        	int right = nums.length - 1;
        	    
        	while (left < right) {
        	    int second = nums[left];
        	    int third = nums[right];

        	    int sum = second + third;
        		
        	    if (target == sum) {
        		triples.add(Arrays.asList(first, second, third));
        		
        		while (nums[left] == second && left < nums.length - 1) {
        		    left++;
        		}
        		
        		while (nums[right] == third && right < nums.length - 1) {
        		    right--;
        		}
        		
        	    } else if (target < sum) {
        		right--;
        	    } else {
        		left++;
        	    }
        	}
	    }
	}
        
	return triples;
    }

}
