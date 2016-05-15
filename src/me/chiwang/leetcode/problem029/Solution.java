/***********************************************************************************************************************
 * 
 * LeetCode Problem 29. Divide Two Integers
 * 
 * Problem:
 * Divide two integers without using multiplication, division and mod operator.
 *
 * If it is overflow, return MAX_INT.  
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem029;

public class Solution {
    public int divide(int dividend, int divisor) {
	// Exception handling
	if (divisor == 0) {
	    return Integer.MAX_VALUE;
	}
	
	if (dividend == Integer.MIN_VALUE) {
	    // TODO handle
	}
	
	boolean isNeg = (dividend < 0) ^ (divisor < 0);
	int negAbsDividend = dividend < 0 ? dividend : -dividend;
	int negAbsDivisor = divisor < 0 ? divisor : -divisor;
	
	int[] nums = new int[64];
	int logn = -1;
	
	while (negAbsDividend <= negAbsDivisor) {
	    nums[++logn] = negAbsDivisor;
	    negAbsDivisor = negAbsDivisor + negAbsDivisor;
	    if (negAbsDivisor >= 0) {
		// Underflow
		break;
	    }
	}
	
	for (int i = logn; i >= 0; i--) {
	    if (negAbsDividend <= nums[i]) {
		negAbsDividend = negAbsDividend - nums[i];
		nums[i] = 1;
	    } else {
		nums[i] = 0;
	    }
	}
	
	int sum = 0;
	
	for (int i = 0; i <= logn; i++) {
	    sum = sum - nums[i] * (1 << i);
	}
	
	if (sum == Integer.MIN_VALUE && !isNeg) {
	    // Overflow
	    return Integer.MAX_VALUE;
	}

	return isNeg ? sum : -sum;

    }
}