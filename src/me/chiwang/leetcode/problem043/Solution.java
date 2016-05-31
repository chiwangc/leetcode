/***********************************************************************************************************************
 * 
 * LeetCode Problem 43. Multiply Strings
 * 
 * Problem:
 * Given two numbers represented as strings, return multiplication of the numbers as a string.
 *
 * Note:
 * - The numbers can be arbitrarily large and are non-negative.
 * - Converting the input string to integer is NOT allowed.
 * - You should NOT use internal library such as BigInteger.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem043;

public class Solution {
    
    public String multiply(String num1, String num2) {

	StringBuilder sum = new StringBuilder();
	StringBuilder n1 = new StringBuilder(num1).reverse();
	StringBuilder n2 = new StringBuilder(num2).reverse();
	
	int[] carries = new int[n1.length() + n2.length()];
	
	for (int i = 0; i < n2.length(); i++) {
	    int carry = 0;
	    int val = n2.charAt(i) - '0';
	    for (int j = 0; j < n1.length(); j++) {		
		int product = val * (n1.charAt(j) - '0') + carries[i + j] + carry;
		carries[i + j] = product % 10;
		carry = product / 10;
	    }
	    if (carry != 0) carries[i + n1.length()] = carry;
	}
	
	boolean isLeadingZero = true;
	for (int i = carries.length - 1; i >= 0; i--) {
	    int carry = carries[i];
	    if (!isLeadingZero || carry != 0) {
		sum.append(carry);
		isLeadingZero = false;
	    }
	}

	return sum.length() == 0 ? "0" : sum.toString();
    }
}