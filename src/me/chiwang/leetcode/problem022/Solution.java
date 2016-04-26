package me.chiwang.leetcode.problem022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	private static Map<Integer, Set<String>> cache;
	
	static {
		cache = new HashMap<>();
		
		Set<String> set0 = new HashSet<String>();
		set0.add("");
		cache.put(0, new HashSet<String>());
		
		Set<String> set1 = new HashSet<String>();
		set1.add("()");
		cache.put(1, set1);
	}
	
    public List<String> generateParenthesis(int n) {
    	return new LinkedList<String>(getParentheses(n));
    }
    
    private Set<String> getParentheses(int n) {
    	if (cache.containsKey(n)) {
        	return cache.get(n);
        }
        
        Set<String> result = new HashSet<String>();
        for (String s : getParentheses(n - 1)) {
        	result.add("(" + s + ")");
        }
        
        for (int i = 1; i < n; i++) {
        	for (String s1 : getParentheses(i)) {
        		for (String s2 : getParentheses(n - i)) {
        			result.add(s1 + s2);
        		}
        	}
        }
        
        cache.put(n, result);
        return result;
    }
    
    public static void main(String[] args) {
    	List<String> list = (new Solution()).generateParenthesis(4);
    	for (String s : list) {
    		System.out.println(s);
    	}
    }
}