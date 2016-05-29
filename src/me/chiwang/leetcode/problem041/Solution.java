/***********************************************************************************************************************
 * 
 * LeetCode Problem 41. First Missing Positive
 * 
 * Problem:
 * Given an unsorted integer array, find the first missing positive integer.
 *
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 *
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem041;

public class Solution {

	public int firstMissingPositive(int[] nums) {

		final int n = nums.length;
		int i = 0;

		while (i < n) {
			int val = nums[i];

			if (val > 0 && val <= n && i != val - 1) {
				if (nums[val - 1] == val) {
					// Already in the correct position
					i++;
				} else {
					swap(i, val - 1, nums);
				}
			} else {
				i++;
			}
		}

		int result = 0;

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				result = j + 1;
				break;
			}
		}

		return result == 0 ? nums.length + 1 : result;
	}

	private void swap(int i, int j, int[] nums) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

}
