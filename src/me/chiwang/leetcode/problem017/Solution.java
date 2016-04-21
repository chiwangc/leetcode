/***********************************************************************************************************************
 * 
 * LeetCode Problem 17. Letter Combinations of a Phone Number
 * 
 * Problem:
 * Given a digit string, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	
	private static Map<String, List<String>> cache;
	
	static {
		cache = new HashMap<>();
		cache.put("", new LinkedList<>());
		cache.put("1", new LinkedList<>());
		cache.put("2", Arrays.asList("a", "b", "c"));
		cache.put("3", Arrays.asList("d", "e", "f"));
		cache.put("4", Arrays.asList("g", "h", "i"));
		cache.put("5", Arrays.asList("j", "k", "l"));
		cache.put("6", Arrays.asList("m", "n", "o"));
		cache.put("7", Arrays.asList("p", "q", "r", "s"));
		cache.put("8", Arrays.asList("t", "u", "v"));
		cache.put("9", Arrays.asList("w", "x", "y", "z"));
	}
	
    public List<String> letterCombinations(String digits) {
        return computeCombinations(digits);
    }
    
    private List<String> computeCombinations(String digits) {
    	if (cache.containsKey(digits)) {
    		return cache.get(digits);
    	}
    	
    	List<String> list1 = computeCombinations(digits.substring(0, digits.length() / 2));
    	List<String> list2 = computeCombinations(digits.substring(digits.length() / 2, digits.length()));
    	
    	List<String> mergedList = merge(list1, list2);
    	cache.put(digits, mergedList);
    	
    	return mergedList;
    }
    
    private List<String> merge(List<String> list1, List<String> list2) {
    	final List<String> mergedList = new LinkedList<>();
    	
    	for (String s1 : list1) {
    		for (String s2 : list2) {
    			mergedList.add(s1 + s2);
    		}
    	}    	
    	return mergedList;
    }
}