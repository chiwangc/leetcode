/***********************************************************************************************************************
 * 
 * LeetCode Problem 10. Regular Expression Matching
 * 
 * Problem:
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem010;

public class Solution {
    
    public boolean isMatch(String string, String pattern) {
	// Assuming p is a valid regex, pattern.char(0) can either be "." or a single character in this case
	
	if (pattern.length() == 0)
	    return string.length() == 0 ? true : false;
	
	if (pattern.length() == 1) {
	    if (string.length() == 1) {
		if (pattern.charAt(0) == '.' || pattern.charAt(0) == string.charAt(0)) {
		    return true;
		} else {
		    return false;
		}
	    } else {
		return false;
	    }
	}
	
	// pattern.length() >= 2
	if (pattern.charAt(1) == '*') {
	    if (pattern.charAt(0) == '.') {
		if (isMatch(string, pattern.substring(2))) {
		    return true;
		}
		for (int i = 0; i < string.length(); i++) {
		    if (isMatch(string.substring(i + 1), pattern.substring(2))) {
			return true;
		    }
		}
		return false;
	    } else {
		if (isMatch(string, pattern.substring(2))) {
		    return true;
		}
		for (int i = 0; i < string.length(); i++) {
		    if (string.charAt(i) == pattern.charAt(0)) {
			if (isMatch(string.substring(i + 1), pattern.substring(2))) {
			    return true;
			}
		    } else {
			return false;
		    }
		}
		return false;
	    }
	} else {
	    if (string.length() == 0) return false;
	    if (pattern.charAt(0) == '.' || pattern.charAt(0) == string.charAt(0)) {
		return isMatch(string.substring(1), pattern.substring(1));
	    } else {
		return false;
	    }
	}	
    }

//    public boolean isMatch(String string, String pattern) {
//
//	if (pattern.length() == 0)
//	    return string.length() == 0 ? true : false;
//
//	if (pattern.length() == 1) {
//	    // Assuming p is a valid regex, pattern can either be "." or a
//	    // single character in this case
//	    if (string.length() == 1) {
//		if (pattern.charAt(0) == '.')
//		    return true;
//		else if (pattern.charAt(0) == string.charAt(0))
//		    return true;
//		else
//		    return false;
//	    } else {
//		return false;
//	    }
//	}
//
//	if (pattern.charAt(1) == '*') {
//	    if (pattern.charAt(0) == '.') {
//		if (isMatch(string, pattern.substring(2)))
//		    return true;
//
//		for (int i = 0; i < string.length(); i++) {
//		    if (isMatch(string.substring(i + 1), pattern.substring(2))) {
//			return true;
//		    }
//		}
//		return false;
//	    } else {
//		if (isMatch(string, pattern.substring(2)))
//		    return true;
//
//		for (int i = 0; i < string.length(); i++) {
//		    if (string.charAt(i) == pattern.charAt(0)) {
//			if (isMatch(string.substring(i + 1), pattern.substring(2))) {
//			    return true;
//			}
//		    } else {
//			break;
//		    }
//		}
//		return false;
//	    }
//	} else {
//	    if ((pattern.charAt(0) == '.' && string.length() > 0) || string.charAt(0) == pattern.charAt(0)) {
//		System.out.println("S: " + string);
//		System.out.println("P: " + pattern);
//		return isMatch(string.substring(1), pattern.substring(1));
//	    } else {
//		return false;
//	    }
//	}
//    }
}
