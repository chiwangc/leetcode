/***********************************************************************************************************************
 * 
 * LeetCode Problem 14. Longest Common Prefix
 * 
 * Problem:
 * Write a function to find the longest common prefix string amongst an array of strings. 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem014;

public class Solution {
    
    public String longestCommonPrefix(String[] strs) {
	
	if (strs.length == 0) {
	    return "";
	} else if (strs.length == 1) {
	    return strs[0];
	}
	
	int minLength = Integer.MAX_VALUE;
	for (int i = 0; i < strs.length; i++) {
	    minLength = minLength < strs[i].length() ? minLength : strs[i].length();
	}
	
	int idx = 0;
        
	while (idx < minLength) {
	    if (!sameChar(idx, strs)) {
		break;
	    }
	    idx++;
	}
	
	return strs[0].substring(0, idx);
    }
    
    private boolean sameChar(int idx, String[] strs) {
	
	if (strs[0].length() == 0) {
	    return false;
	}	
	char currChar = strs[0].charAt(idx);
	
	for (int i = 1; i < strs.length; i++) {
	    if (currChar != strs[i].charAt(idx)) {
		return false;
	    }
	}
	
	return true;
    }
    
}