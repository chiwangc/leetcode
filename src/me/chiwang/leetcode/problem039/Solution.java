package me.chiwang.leetcode.problem039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    
    public static void main(String[] args) {
	
	Solution solution = new Solution();
	List<List<Integer>> lists = solution.combinationSum(new int[] {2, 3, 6, 7}, 7);
	
	for (List<Integer> list : lists) {
	    System.out.println(list);
	}
		
	System.out.println("End");
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        return compute(candidates, target);
    }
    
    private List<List<Integer>> compute(int[] candidates, int target) {
	List<List<Integer>> combination = new ArrayList<List<Integer>>();
	int candidate = candidates[candidates.length - 1];
	
	if (candidates.length == 1) {
	    if (target % candidate == 0) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < target / candidate; i++) {
		    list.add(candidate);
		}
		combination.add(list);
	    }
	    return combination;
	}
	
	int count = 0;
	
	while (target >= 0) {
	    List<List<Integer>> lists = compute(Arrays.copyOfRange(candidates, 0, candidates.length - 1), target);
	    
	    if (lists.size() > 0) {
		for (List<Integer> list : lists) {
		    for (int i = 0; i < count; i++) {
			list.add(candidate);
		    }
		    combination.add(list);
		}
	    }
	    
	    target = target - candidate;
	    count++;
	}
	
	return combination;	
    }
    
}