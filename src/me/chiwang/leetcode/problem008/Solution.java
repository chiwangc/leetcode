/***********************************************************************************************************************
 * 
 * LeetCode Problem 8. String to Integer (atoi)
 * 
 * Problem:
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * 
 * Requirements for atoi:
 * 
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * 
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * 
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * 
 * If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem008;

public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
        	return 0;
        }
        
        int idx = 0;
        // Remove leading space characters
        while (idx < str.length() && str.charAt(idx) == ' ') {
        	idx++;
        }
        
        boolean isNeg = false;
        if (str.charAt(idx) == '-') {
        	isNeg = true;
        	idx++;
        } else if (str.charAt(idx) == '+') {
        	idx++;
        }
        
        long result = 0;
        while (idx < str.length() && str.charAt(idx) >= '0' && str.charAt(idx) <= '9') {
        	result = result * 10 + (str.charAt(idx) - '0');
        	if (result > Integer.MAX_VALUE) {
        		if (isNeg) {
        			return Integer.MIN_VALUE;
        		} else {
        			return Integer.MAX_VALUE;
        		}
        	}
        	idx++;
        }
        
        if (isNeg) {
        	result = -result;
        	if (result < Integer.MIN_VALUE) {
        		return Integer.MIN_VALUE;
        	}
        } else {
        	if (result > Integer.MAX_VALUE) {
        		return Integer.MAX_VALUE;
        	}
        }
        
        return (int) result;
    }
}