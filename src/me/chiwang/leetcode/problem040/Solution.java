package me.chiwang.leetcode.problem040;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	
	Arrays.sort(candidates);
		
	Set<List<Integer>> set = findCombinations(candidates, target);	
	return new LinkedList<List<Integer>>(set);
    }
    
    private Set<List<Integer>> findCombinations(int[] candidates, int target) {
	
	int idx = -1;
		
	for (int i = candidates.length - 1; i >= 0; i--) {
	    if (candidates[i] > target) {
		idx = i;
	    }
	}
		
	if (idx != -1) {
	    candidates = Arrays.copyOfRange(candidates, 0, idx);
	}
	
	Set<List<Integer>> combinations = new HashSet<>();
	
	if (target == 0) {
	    
	    combinations.add(new LinkedList<>());

	} else if (candidates.length == 0) {
	    
	} else if (candidates.length == 1) {
	    
	    if (candidates[0] == target) {
		List<Integer> result = new LinkedList<Integer>();
		result.add(candidates[0]);
		
		combinations.add(result);
	    }
	} else {
	    	
	    // Do not use candidates[n - 1]
	    Set<List<Integer>> list1 = findCombinations(Arrays.copyOfRange(candidates, 0, candidates.length - 1), target);
	    if (list1.size() > 0) {
		combinations.addAll(list1);
	    }
        	
	    // Use candidates[n - 1]
	    Set<List<Integer>> list2 = findCombinations(Arrays.copyOfRange(candidates, 0, candidates.length - 1), target - candidates[candidates.length - 1]);
	    if (list2.size() > 0) {
        	for (List<Integer> combination : list2) {
        	    combination.add(candidates[candidates.length - 1]);
        	    combinations.add(combination);
        	}
	    }
	}
	
	return combinations;
    }
    
    public static void main(String[] args) {
	
	Solution solution = new Solution();	
	int[] candidates = new int[] {10,1,2,7,6,1,5};
	int target = 8;
	
	for (List<Integer> result : solution.combinationSum2(candidates, target)) {
	    System.out.println(result);
	}
    }
}