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