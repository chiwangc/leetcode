/***********************************************************************************************************************
 * 
 * LeetCode Problem 18. 4Sum
 * 
 * Problem:
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note:
 * - Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 * - The solution set must not contain duplicate quadruplets.
 *
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 *
 * A solution set is:
 * (-1,  0, 0, 1)
 * (-2, -1, 1, 2)
 * (-2,  0, 0, 2)
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem018;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
		
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	   	
    	final Map<Integer, List<int[]>> lookup = new HashMap<>();
    	final Set<List<Integer>> resultSet = new HashSet<>();
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = i + 1; j < nums.length; j++) {
    			int sum = nums[i] + nums[j];
    			if (!lookup.containsKey(sum)) {
    				lookup.put(sum, new LinkedList<>());
    			}
    			lookup.get(sum).add(new int[] {i, j});    			
    		}
    	}
    	
        for (int key : lookup.keySet()) {
        	int complement = target - key;
        	if (lookup.containsKey(complement)) {
        		List<int[]> list1 = lookup.get(key);
        		List<int[]> list2 = lookup.get(complement);
        		mergeAndAddtoResult(list1, list2, nums, resultSet);
        	}
        }
        
        return new LinkedList<List<Integer>>(resultSet);
    }
    
    private void mergeAndAddtoResult(List<int[]> list1, List<int[]> list2, int[] nums, Set<List<Integer>> resultSet) {
    	for (int[] nums1 : list1) {
    		for (int[] nums2 : list2) {
    			if (nums1[0] == nums2[0] || nums1[0] == nums2[1] || nums1[1] == nums2[0] || nums1[1] == nums2[1]) {
    				continue;
    			}
    			List<Integer> list = Arrays.asList(nums[nums1[0]], nums[nums1[1]], nums[nums2[0]], nums[nums2[1]]);
    			Collections.sort(list);
    			resultSet.add(list);
    		}
    	}
    }    
}