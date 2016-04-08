/***********************************************************************************************************************
 * 
 * LeetCode Problem 7. Reverse Integer
 * 
 * Problem:
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * Have you thought about this?
 *
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 *
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 *
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 
 * 1000000003 overflows. How should you handle such cases?
 *
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem007;

public class Solution {
    
    public int reverse(int x) {
	
	if (x < 1_000_000_000 && x > -1_000_000_000) {
	    // x has less than 10 digits and will definitely not overflow
	    return reverseInt(x);
	}
	
	// x has 10 digits
	if (x == Integer.MIN_VALUE)
	    return 0;
	
	final boolean negNum = x < 0 ? true : false;
	int xPos = negNum ? -x : x;

	// Integer.MAX_VALUE = 2147483647
	int[] intMaxValueDigits = new int[] {2, 1, 4, 7, 4, 8, 3, 6, 4, 7};
	
	for (int i = 0; i < intMaxValueDigits.length; i++) {
	    if (xPos % 10 > intMaxValueDigits[i]) {
		// Overflow
		return 0;
	    } else if (xPos % 10 < intMaxValueDigits[i]) {
		// Okay
		return reverseInt(x);
	    }	    
	    xPos /= 10;
	}
	
	return reverseInt(x);
    }
    
    private int reverseInt(int x) {
	
	final boolean negNum = x < 0 ? true : false;
	x = negNum ? -x : x;
	
	int sum = 0;
	while (x > 0) {
	    sum *= 10;	    
	    sum += (x % 10);
	    x /= 10;
	}
	return negNum ? -sum : sum;
    }
}