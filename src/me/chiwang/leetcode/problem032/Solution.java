package me.chiwang.leetcode.problem032;

public class Solution {
       
    public int longestValidParentheses(String s) {
	
	// dp[i] denotes the length of the longest valid parentheses ending at s.char(i - 1)
	int[] dp = new int[s.length() + 1];
	dp[0] = 0;
	int result = 0;
	
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == '(') {
		dp[i + 1] = 0;
	    } else {	// s.charAt(i) == ')'
		int j = i - dp[i] - 1;
		if (j >= 0 && s.charAt(j) == '(') {
		    dp[i + 1] = dp[i] + 2 + dp[j];
		    result = result > dp[i + 1] ? result : dp[i + 1];
		    
		} else {
		    dp[i + 1] = 0;
		}
	    }
	}

	return result;
    }

}