package me.chiwang.leetcode.problem020;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Solution {
    public boolean isValid(String s) {
    	LinkedList<Character> stack = new LinkedList<>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		switch (s.charAt(i)) {
    			case '(':
    				stack.add(')');
    				break;
    			case '[':
    				stack.add(']');
    				break;
    			case '{':
    				stack.add('}');
    				break;
    			default:
    				try {
	    				if (s.charAt(i) != stack.removeLast()) {
	    					return false;
	    				}
    				} catch (NoSuchElementException e) {
    					return false;
    				}
    		}
    	}
        
    	if (stack.size() == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
