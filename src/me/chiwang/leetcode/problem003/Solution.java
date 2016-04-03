/***********************************************************************************************************************
 * 
 * LeetCode Problem 3. Longest Substring Without Repeating Characters
 * 
 * Problem:
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest 
 * substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring 
 * is "b", with the length of 1.
 *
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem003;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
	if (s == null || s.length() == 0) {
	    return 0;
	}

	int maxLength = 0;
	Set<Character> set = new HashSet<>();
	int turtle = 0;
	int rabbit = 0;

	while (rabbit < s.length()) {
	    // Rabbit Pass
	    while (rabbit < s.length() && !set.contains(s.charAt(rabbit))) {
		set.add(s.charAt(rabbit));
		rabbit++;
	    }

	    maxLength = maxLength > (rabbit - turtle) ? maxLength : rabbit - turtle;

	    if (rabbit == s.length()) {
		break;
	    }

	    // Turtle Pass
	    while (turtle < rabbit && (s.charAt(turtle) != s.charAt(rabbit))) {
		set.remove(s.charAt(turtle));
		turtle++;
	    }

	    while (turtle < rabbit && (s.charAt(turtle) == s.charAt(rabbit))) {
		turtle++;
	    }
	    set.remove(s.charAt(rabbit));
	}

	return maxLength;
    }

}
