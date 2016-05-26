package me.chiwang.leetcode.problem038;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    private static Map<Integer, String> map = new HashMap<>();
    
    public String countAndSay(int n) {
	if (map.containsKey(n)) {
	    return map.get(n);
	}
	
        if (n == 1) {
            map.put(1, "1");
            return map.get(1);
        } else {
            final String prev = countAndSay(n - 1);
            StringBuilder sb = new StringBuilder();
            
            int count = 0;
            for (int i = 0; i < prev.length(); i++) {
        	if (i < prev.length() - 1 && prev.charAt(i) == prev.charAt(i + 1)) {
        	    count++;
        	    continue;
        	} else {
        	    sb.append(Integer.toString(count + 1));
        	    sb.append(prev.charAt(i));
        	    count = 0;
        	}
            }
            
            map.put(n, sb.toString());
            return map.get(n);
        }
    }
}
