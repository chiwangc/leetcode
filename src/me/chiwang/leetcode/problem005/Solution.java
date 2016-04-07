/***********************************************************************************************************************
 * 
 * LeetCode Problem 5. Longest Palindromic Substring
 * 
 * Problem:
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem005;

import java.util.Arrays;

public class Solution {
    public String longestPalindrome(String s) {

	if (s.length() <= 1)
	    return s;
	
	boolean[][] dp = new boolean[2][s.length()];
	Arrays.fill(dp[0], true);
	Arrays.fill(dp[1], true);
	
	boolean[] shallContinue = new boolean[] {true, true};
	
	int start = 0;
	int length = 0;
	
	for (int i = 2; i <= s.length(); i++) {
	    
	    int oddOrEven = i % 2;
	    
	    if (!shallContinue[oddOrEven]) {
		if (!shallContinue[(oddOrEven + 1) % 2]) {
		    break;
		}
	    }
	    
	    shallContinue[oddOrEven] = false;
	    
	    for (int j = 0; j < s.length(); j++) {
		if (dp[oddOrEven][j]) {
		    dp[oddOrEven][j] = false;
		    
		    // Check to see whether the ends are equal
		    int left, right;
		    
		    if (oddOrEven == 0) {
			// Even
			left = j - (i / 2 - 1);
			right = j + (i / 2);
		    } else {
			// Odd
			left = j - (i - 1) / 2;
			right = j + (i - 1) / 2;	
		    }
		    
		    if (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
			    shallContinue[oddOrEven] = true;
			    dp[oddOrEven][j] = true;
			    start = left;
			    length = i;
			}
		    }
		}
	    }
	}
	
	return s.substring(start, start + length);
    }
}
