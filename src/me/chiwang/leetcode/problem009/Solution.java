/***********************************************************************************************************************
 * 
 * LeetCode Problem 9. Palindrome Number
 * 
 * Problem:
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * Some hints:
 * 
 * Could negative integers be palindromes? (ie, -1)
 * 
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * 
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * 
 * There is a more generic way of solving this problem.
 * 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem009;

public class Solution {
    public boolean isPalindrome(int x) {
	if (x < 0) {
	    return false;
	}

	int numOfDigits = (int) Math.floor(Math.log10(x));

	while (numOfDigits > 0) {
	    int numOfZeros = (int) Math.pow(10, numOfDigits);
	    int lsd = x % 10;
	    int msd = x / numOfZeros;

	    if (lsd != msd) {
		return false;
	    }

	    numOfDigits -= 2;
	    x = (x % numOfZeros) / 10;
	}

	return true;
    }
}