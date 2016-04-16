package me.chiwang.leetcode.problem013;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    private static Map<Character, Integer> map = new HashMap<Character, Integer>();
    
    static {
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
    }
    
    public int romanToInt(String s) {
        if (s.length() == 1) {
            return map.get(s.charAt(0));
        }
        
        int sum = 0;
        char curr;
        char next;
        
        for (int i = 0; i < s.length() - 1; i++) {
            curr = s.charAt(i);
            next = s.charAt(i + 1);
            
            if (map.get(curr) < map.get(next)) {
        	sum -= map.get(curr);
            } else {
        	sum += map.get(curr);
            }
        }
        
        sum += map.get(s.charAt(s.length() - 1));
        
        return sum;
    }
}
