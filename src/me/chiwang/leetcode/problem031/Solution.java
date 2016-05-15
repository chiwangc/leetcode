/***********************************************************************************************************************
 * 
 * LeetCode Problem 31. Next Permutation 
 * 
 * Problem:
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place, do not allocate extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1 
 * 
 ***********************************************************************************************************************/

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
