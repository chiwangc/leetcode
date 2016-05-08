package me.chiwang.leetcode.problem031;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) return;
        
        int idx = nums.length - 2;
        while (idx >= 0) {
        	if (nums[idx] >= nums[idx + 1]) {
        		idx--;
        	} else {
        		// Swap now!
        		int i = nums.length - 1;
        		while (nums[idx] >= nums[i]) i--;
        		swap(nums, idx, i);
        		
        		int j = idx + 1;
        		int k = nums.length - 1;
        		while (j < k) {
        			swap(nums, j++, k--);
        		}
        		return;
        	}
        }
        
        if (idx == -1) {
        	// reverse the array
        	int i = 0;
        	int j = nums.length - 1;
        	while (i < j) {
        		swap(nums, i++, j--);
        	}
        }
    }
    
    private void swap(int[] nums, int i, int j) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
    
    public static void main(String[] args) {
    	int[] nums = new int[] {1, 1, 5};
    	Solution solution = new Solution();
    	solution.nextPermutation(nums);
    	
    	for (int i : nums) {
    		System.out.print(i + ", ");
    	}
    	System.out.println();
    }
}
