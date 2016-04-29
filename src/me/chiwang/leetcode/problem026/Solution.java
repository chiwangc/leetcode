package me.chiwang.leetcode.problem026;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	if (nums.length == 0) {
    		return 0;
    	} else if (nums.length == 1) {
    		return 1;
    	}
    	
    	int curr = nums[0];
    	int count = 1;
    	
        for (int i = 1; i < nums.length; i++) {
        	if (curr != nums[i]) {
        		nums[count++] = nums[i];
        	}
        	curr = nums[i];
        }
        
        return count;
    }
}
